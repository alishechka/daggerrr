package com.example.daggermanualinjection.scopes

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

//think of it how long something should survive
//Singleton = forever
//runtime = at runtime