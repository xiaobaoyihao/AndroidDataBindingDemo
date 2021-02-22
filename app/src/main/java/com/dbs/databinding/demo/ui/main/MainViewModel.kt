package com.dbs.databinding.demo.ui.main

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    var mClickedCount = MutableLiveData(0)

    fun onClickBtn(view: View) {
        // mCLickCount++
        mClickedCount.value = mClickedCount.value?.inc()?: 0
    }
}
