package com.home_assignment.tretton37.domain

import com.home_assignment.tretton37.data.repository.MainRepository
import com.home_assignment.tretton37.domain.model.Question
import kotlinx.coroutines.flow.Flow

interface MainUseCase{
    fun execute() : Flow<List<Question>>
}

class MainUseCaseImpl(val repository: MainRepository) : MainUseCase {
    override fun execute(): Flow<List<Question>> {
        TODO("Not yet implemented")
    }

}

