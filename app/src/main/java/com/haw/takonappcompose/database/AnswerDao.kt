package com.haw.takonappcompose.database

import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface AnswerDao {

    @Insert
    fun addAnswer(answerEntity: AnswerEntity)

    @Query("SELECT * FROM `answers`")
    fun getAnswer(): Flow<AnswerEntity>

}