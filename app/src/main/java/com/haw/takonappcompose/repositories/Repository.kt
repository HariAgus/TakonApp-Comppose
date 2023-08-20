package com.haw.takonappcompose.repositories

import com.haw.takonappcompose.models.Answer
import com.haw.takonappcompose.models.BaseModel
import com.haw.takonappcompose.models.Message
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun askQuestion(prevQuestion: List<Message>, question: String): BaseModel<Answer>

    suspend fun getMessages(): Flow<List<Message>>

    suspend fun addAnswer(answer: Message)

}