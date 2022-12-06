package com.myapplication3.sample

import android.app.Application
import dev.icerock.moko.permissions.PermissionsController

class App : Application() {

    val permissionsController: PermissionsController by lazy { PermissionsController(applicationContext = this) }

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}