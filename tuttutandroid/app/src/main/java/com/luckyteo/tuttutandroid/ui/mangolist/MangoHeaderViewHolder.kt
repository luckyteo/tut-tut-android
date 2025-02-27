package com.luckyteo.tuttutandroid.ui.mangolist

import com.luckyteo.tuttutandroid.ui.common.BaseViewHolder
import com.luckyteo.tuttutandroid.databinding.ViewMangoHeaderBinding

class MangoHeaderViewHolder(private val binding: ViewMangoHeaderBinding) :
    BaseViewHolder<MangoItem>(binding.root) {

    override fun bindData(item: MangoItem) {
        binding.label.text = item.label
    }
}