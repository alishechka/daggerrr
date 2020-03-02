package com.example.daggermanualinjection

import android.app.Application

//this name added to Manifest, instantiated here for all activities
//these are application's dependencies
class MyApplication : Application() {

    lateinit var networkService: NetworkService
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        DependencyComponent.inject(this)
        super.onCreate()
    }
}