package com.example.daggermanualinjection

import android.content.Context

class NetworkService(
    private val context: Context,
    private val apiKey: String
) {
    fun getDummyData(): String = "NETWORK_DUMMY_DATA"

}
