package com.home_assignment.tretton37.di

import com.home_assignment.tretton37.data.HardcodedData
import com.home_assignment.tretton37.data.HardcodedDataImpl
import com.home_assignment.tretton37.data.repository.MainRepository
import com.home_assignment.tretton37.data.repository.MainRepositoryImpl
import com.home_assignment.tretton37.domain.MainUseCase
import com.home_assignment.tretton37.domain.MainUseCaseImpl
import com.home_assignment.tretton37.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}

val hardcodedDataModule = module {
    single<HardcodedData> { HardcodedDataImpl() }
}

val repositoryModule = module {
    single<MainRepository> { MainRepositoryImpl(get()) }
}

val useCaseModules = module {
    single<MainUseCase> { MainUseCaseImpl(get()) }
}