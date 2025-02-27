package com.luckyteo.tuttutandroid.util

import androidx.annotation.IntDef

@IntDef(SECTION_HEADER, SECTION_ITEM)
@Retention(AnnotationRetention.SOURCE)
annotation class MangoType

const val SECTION_HEADER = 1
const val SECTION_ITEM = 2