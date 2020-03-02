package com.example.daggermanualinjection

import android.content.Context

class DatabaseService(
    private val context: Context,
    private val versionNumber: Int
) {

    fun getDummyData(): String = "DATABASE_SERVICE_DATA"

}
