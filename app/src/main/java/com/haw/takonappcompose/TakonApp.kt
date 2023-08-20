package com.haw.takonappcompose

import android.app.Application
import androidx.room.Room
import com.haw.takonappcompose.database.AppDatabase
import com.haw.takonappcompose.network.Api
import com.haw.takonappcompose.repositories.Repository
import com.haw.takonappcompose.repositories.RepositoryImpl
import org.koin.core.context.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TakonApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(module {
                single {
                    Retrofit.Builder()
                        .baseUrl("https://api.openai.com/v1/chat/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                single {
                    val retrofit: Retrofit = get()
                    retrofit.create(Api::class.java)
                }
                single {
                    Room.databaseBuilder(
                        this@TakonApp,
                        AppDatabase::class.java,
                        "db_takon"
                    ).build()
                }
                single {
                    val api: Api = get()
                    val database: AppDatabase = get()

                    RepositoryImpl(api = api, dao = database.answerDao())

                } bind Repository::class
            })
        }

    }

}