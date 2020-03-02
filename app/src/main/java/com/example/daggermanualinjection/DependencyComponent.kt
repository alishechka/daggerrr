package com.example.daggermanualinjection

object DependencyComponent {

    fun inject(activity: MainActivity) {
        val app = activity.application as MyApplication
        activity.viewModel = MainViewModel(app.networkService, app.databaseService)
    }

    fun inject(application: MyApplication) {
        application.networkService = NetworkService(application, "123456789")
        application.databaseService = DatabaseService(application, 1)
    }
}