package com.luckyteo.tuttutandroid.ui.mangolist

import com.luckyteo.tuttutandroid.ui.common.ViewEffect
import com.luckyteo.tuttutandroid.ui.common.ViewEvent
import com.luckyteo.tuttutandroid.ui.common.ViewState

class MangoContract {
    class Event : ViewEvent {}
    sealed class State() : ViewState
    data object StateIdle : State()
    data class MangoState(
        val list: MutableList<MangoItem>
    ) : State()

    class Effect : ViewEffect {}
}