package com.luckyteo.tuttutandroid.ui.mangolist

import android.view.LayoutInflater
import android.view.ViewGroup
import com.luckyteo.tuttutandroid.ui.common.BaseAdapter
import com.luckyteo.tuttutandroid.ui.common.BaseViewHolder
import com.luckyteo.tuttutandroid.databinding.ViewMangoHeaderBinding
import com.luckyteo.tuttutandroid.databinding.ViewMangoItemBinding
import com.luckyteo.tuttutandroid.util.SECTION_HEADER

class MangoAdapter : BaseAdapter<BaseViewHolder<MangoItem>, MangoItem>() {
    private val list = mutableListOf<MangoItem>()
    override fun setData(newList: MutableList<MangoItem>) {
        list.clear()
        list.addAll(newList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MangoItem> {
        return when (viewType) {
            SECTION_HEADER -> {
                MangoHeaderViewHolder(
                    ViewMangoHeaderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            // item
            else -> {
                MangoItemViewHolder(
                    ViewMangoItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MangoItem>, position: Int) {
        val viewType = getItemViewType(position)
        when (viewType) {
            SECTION_HEADER -> {
                val hold = holder as MangoHeaderViewHolder
                hold.bindData(getItem(position))
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].type
    }
}