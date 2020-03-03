package com.example.daggermanualinjection

import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService
) {

    fun someData(): String =
        networkService.getDummyData() + databaseService.getDummyData()

}