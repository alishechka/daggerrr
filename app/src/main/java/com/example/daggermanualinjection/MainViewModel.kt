package com.example.daggermanualinjection

class MainViewModel(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService
) {

    fun someData(): String =
        networkService.getDummyData() + databaseService.getDummyData()

}