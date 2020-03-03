package com.example.daggermanualinjection.di.module

import com.example.daggermanualinjection.DatabaseService
import com.example.daggermanualinjection.MainViewModel
import com.example.daggermanualinjection.NetworkService
import com.example.daggermanualinjection.scopes.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun providesMainViewModel(
        networkService: NetworkService,
        databaseService: DatabaseService
    ): MainViewModel {
        return MainViewModel(networkService, databaseService)
    }

}