package com.example.verticalgridsupportsample

import android.R
import android.util.Log
import android.view.ViewGroup
import android.widget.TextView
import androidx.leanback.widget.Presenter


class StringPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val tv = TextView(parent.context)
        tv.isFocusable = true
        tv.isFocusableInTouchMode = true
        tv.background = parent.context.resources.getDrawable(R.drawable.btn_default)
        return ViewHolder(tv)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
        Log.d(TAG, "onBindViewHolder for $item")
        (viewHolder.view as TextView).text = item.toString()
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {
        Log.d(TAG, "onUnbindViewHolder")
    }

    companion object {
        private const val TAG = "StringPresenter"
    }
}