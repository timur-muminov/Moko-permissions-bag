package com.myapplication3.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.myapplication3.R
import dev.icerock.moko.permissions.Permission
import dev.icerock.moko.permissions.PermissionsController
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val permissionsController = PermissionsController(applicationContext = this)

        permissionsController.bind(lifecycle, supportFragmentManager)

        with(lifecycleScope) {
            launch { permissionsController.providePermission(Permission.STORAGE) }
            launch { permissionsController.providePermission(Permission.CAMERA) }
        }

    }
}