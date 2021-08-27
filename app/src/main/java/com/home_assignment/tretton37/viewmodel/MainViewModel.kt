package com.home_assignment.tretton37.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.home_assignment.tretton37.domain.MainUseCase
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainUseCase: MainUseCase
) : ViewModel() {

    val showProgressBar: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>().apply { value = false }
    }

    init {
        viewModelScope.launch {
            mainUseCase.execute().onStart { showProgressBar.value = true }
                .onCompletion { showProgressBar.value = false }
//                .catch { exception -> }.collect { result ->
//
//                }
        }
    }
}