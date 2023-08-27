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