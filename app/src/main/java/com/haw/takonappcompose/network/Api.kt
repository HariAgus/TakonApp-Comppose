package com.haw.takonappcompose.network

import com.haw.takonappcompose.models.Answer
import com.haw.takonappcompose.models.Question
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

const val APIKEY = "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"

interface Api {

    @POST("completions")
    @Headers("Authorization: Bearer $APIKEY", "Content-Type: application/json")
    suspend fun askQuestion(
        @Body question: Question
    ): Response<Answer>

}