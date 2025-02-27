package com.luckyteo.tuttutandroid.ui.common

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseViewHolder<T: BaseItem>(view: View): ViewHolder(view) {

    abstract fun bindData(item: T)
}