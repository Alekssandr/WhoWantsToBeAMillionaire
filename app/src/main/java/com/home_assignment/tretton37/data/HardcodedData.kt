package com.home_assignment.tretton37.data

import com.home_assignment.tretton37.data.model.QuestionEntity

interface HardcodedData {
    fun getBlockData(): List<QuestionEntity>
}

class HardcodedDataImpl : HardcodedData {
    //TODO add hardcoded data
    override fun getBlockData(): List<QuestionEntity> {
        return listOf(
            QuestionEntity()
        )
    }
}