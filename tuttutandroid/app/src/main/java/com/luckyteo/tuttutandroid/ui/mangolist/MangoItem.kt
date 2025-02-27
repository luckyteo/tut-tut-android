package com.luckyteo.tuttutandroid.ui.mangolist

import com.luckyteo.tuttutandroid.ui.common.BaseItem
import com.luckyteo.tuttutandroid.util.MangoType
import com.luckyteo.tuttutandroid.util.SECTION_ITEM

data class MangoItem(
    val label: String = "",
    @MangoType val type: Int = SECTION_ITEM
) : BaseItem()