package com.luckyteo.tuttutandroid.ui.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<T : ViewBinding> : Fragment() {
    protected lateinit var binding: T
    abstract fun declareBinding(layoutInflater: LayoutInflater, container: ViewGroup?): T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = declareBinding(layoutInflater, container)
        return binding.root
    }

    fun findMyNavController(): NavController {
        return Navigation.findNavController(binding.root)
    }
}