package com.myapplication3.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myapplication3.R
import dev.icerock.moko.permissions.PermissionsController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val permissionsController = PermissionsController(applicationContext = this)



    }
}