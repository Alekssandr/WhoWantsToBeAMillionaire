package com.home_assignment

import android.app.Application
import com.home_assignment.tretton37.di.hardcodedDataModule
import com.home_assignment.tretton37.di.repositoryModule
import com.home_assignment.tretton37.di.useCaseModules
import com.home_assignment.tretton37.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    viewModelModule,
                    hardcodedDataModule,
                    repositoryModule,
                    useCaseModules
                )
            )
        }
    }
}