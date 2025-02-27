package com.luckyteo.tuttutandroid.ui.mangolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.luckyteo.tuttutandroid.ui.common.BaseFragment
import com.luckyteo.tuttutandroid.databinding.FragmentMangoListBinding
import kotlinx.coroutines.launch

class MangoListFragment : BaseFragment<FragmentMangoListBinding>() {

    private var adapter: MangoAdapter? = null
    private val viewModel : MangoViewModel by viewModels()
    override fun declareBinding(
        layoutInflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMangoListBinding {
        return FragmentMangoListBinding.inflate(layoutInflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            listMango.layoutManager = layoutManager
            adapter = MangoAdapter()
            listMango.adapter = adapter
        }

        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect{ state ->
                    when (state) {

                        else -> {}
                    }
                }
            }
        }
    }
}