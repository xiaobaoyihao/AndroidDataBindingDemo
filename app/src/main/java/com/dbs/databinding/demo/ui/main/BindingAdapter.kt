package com.dbs.databinding.demo.ui.main

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

/**
 *** create by dingbaosheng
 *** time:2021/2/18 4:15 下午
 **/
object BindingAdapter {

    @BindingAdapter("update_bg_color")
    @JvmStatic
    fun updateBgColor(view: TextView, clickCount: Int) {
        when (clickCount) {
            0 ->  view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_green_light))
            1 ->   view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.darker_gray))
            else -> view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_red_light))
        }
    }
}