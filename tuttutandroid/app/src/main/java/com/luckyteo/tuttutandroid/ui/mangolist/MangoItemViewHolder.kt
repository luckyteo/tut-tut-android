package com.luckyteo.tuttutandroid.ui.mangolist

import com.luckyteo.tuttutandroid.ui.common.BaseViewHolder
import com.luckyteo.tuttutandroid.databinding.ViewMangoItemBinding

class MangoItemViewHolder(private val binding: ViewMangoItemBinding) :
    BaseViewHolder<MangoItem>(binding.root) {
    override fun bindData(item: MangoItem) {
        binding.label.text = item.label
    }

}