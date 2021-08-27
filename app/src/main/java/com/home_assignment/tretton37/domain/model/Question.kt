package com.home_assignment.tretton37.domain.model


data class Question(val title: String, val imageUrl: String, val userAnswer: UserAnswer)

enum class UserAnswer{
    CORRECT,
    WRONG,
    UNANSWERED,
    DEFAULT
}