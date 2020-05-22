package com.algokelvin.catalog.movie.tv.utils.layout

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent

class AlgoKelvinViewPager(context: Context, attributeSet: AttributeSet) : androidx.viewpager.widget.ViewPager(context, attributeSet) {
    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}