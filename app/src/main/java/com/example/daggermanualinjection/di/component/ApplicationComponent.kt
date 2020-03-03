package com.example.daggermanualinjection.di.component

import com.example.daggermanualinjection.DatabaseService
import com.example.daggermanualinjection.MyApplication
import com.example.daggermanualinjection.NetworkService
import com.example.daggermanualinjection.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ApplicationModule::class])
@Singleton
interface ApplicationComponent {

    //class we wanna give dependencies to
    fun inject(application: MyApplication)

    //will scan ApplicationModule to see if it can find something with same return type
    fun networkService(): NetworkService

    fun databaseService(): DatabaseService

}