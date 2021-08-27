package com.home_assignment.tretton37.data.repository

import com.home_assignment.tretton37.data.HardcodedData
import com.home_assignment.tretton37.domain.model.Question
import kotlinx.coroutines.flow.Flow

interface MainRepository {
   suspend fun getQuestions() : Flow<List<Question>>
}

class MainRepositoryImpl(private val hardcodedData: HardcodedData): MainRepository {
   override suspend fun getQuestions(): Flow<List<Question>> {
      TODO("Not yet implemented")
   }

}