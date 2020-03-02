package com.example.daggermanualinjection

import android.app.Application
import com.example.daggermanualinjection.di.component.DaggerApplicationComponent
import com.example.daggermanualinjection.di.module.ApplicationModule
import javax.inject.Inject

//this name added to Manifest, instantiated here for all activities
//these are application's dependencies
class MyApplication : Application() {

    //supply depen. for THIS instance
    @Inject
    lateinit var networkService: NetworkService
    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()

        //build project first (green hammer) then can get bellow code
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build().inject(this)

    }
}