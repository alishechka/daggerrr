package com.example.daggermanualinjection.di.component

import com.example.daggermanualinjection.MainActivity
import com.example.daggermanualinjection.di.module.ActivityModule
import com.example.daggermanualinjection.scopes.ActivityScope
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [ActivityModule::class],
    dependencies = [ApplicationComponent::class]
)
@ActivityScope
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
}