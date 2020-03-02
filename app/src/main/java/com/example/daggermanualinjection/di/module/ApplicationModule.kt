package com.example.daggermanualinjection.di.module

import android.app.Application
import com.example.daggermanualinjection.DatabaseService
import com.example.daggermanualinjection.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideNetworkService(): NetworkService {
        return NetworkService(application, "12345")
    }

    @Provides
    @Singleton
    fun provideDatabaseService(): DatabaseService {
        return DatabaseService(application, 2)
    }
}