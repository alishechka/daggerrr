package com.example.daggermanualinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggermanualinjection.di.component.DaggerActivityComponent
import com.example.daggermanualinjection.di.module.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //now we have activity model/component
//        val app = (application as MyApplication)
//        viewModel = MainViewModel(app.networkService, app.databaseService)
        DaggerActivityComponent.builder()
            .applicationComponent((application as MyApplication).component())
            .activityModule(ActivityModule())
            .build()
            .inject(this)




        tv_display.text = viewModel.someData()

    }
}
