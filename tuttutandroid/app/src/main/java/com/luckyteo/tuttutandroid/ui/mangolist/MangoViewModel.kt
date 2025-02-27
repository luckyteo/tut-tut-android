package com.luckyteo.tuttutandroid.ui.mangolist

import com.luckyteo.tuttutandroid.ui.common.BaseViewModel

class MangoViewModel: BaseViewModel<MangoContract.Event, MangoContract.State, MangoContract.Effect>() {
    override fun createInitialState(): MangoContract.State {
        return MangoContract.StateIdle
    }

    override fun handleEvent(event: MangoContract.Event) {
        
    }

}