package com.myapplication3.sample

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.myapplication3.databinding.TestFragmentBinding
import dev.icerock.moko.permissions.Permission
import kotlinx.coroutines.launch

class TestFragment : BaseFragment<TestFragmentBinding>(TestFragmentBinding::inflate) {

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        lifecycleScope.launch {
            App.instance.permissionsController.providePermission(Permission.COARSE_LOCATION)
        }
    }
}