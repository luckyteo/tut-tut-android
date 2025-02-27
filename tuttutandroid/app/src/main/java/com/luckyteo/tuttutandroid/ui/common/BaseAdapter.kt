package com.luckyteo.tuttutandroid.ui.common

import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseAdapter<VH : ViewHolder, Item : BaseItem> : Adapter<VH>() {
    private val list = mutableListOf<Item>()
    abstract fun setData(newList: MutableList<Item>)

    fun getItem(position: Int): Item {
        return list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}