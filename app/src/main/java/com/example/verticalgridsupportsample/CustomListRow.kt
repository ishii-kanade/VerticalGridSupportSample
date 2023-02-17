package com.example.verticalgridsupportsample

import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ObjectAdapter


/**
 * Used with [CustomListRowPresenter], it can display multiple rows.
 * Use [.setNumRows] method to specify the number of rows, default 1.
 */
class CustomListRow : ListRow {
    private var mNumRows = 1

    constructor(header: HeaderItem?, adapter: ObjectAdapter?) : super(header, adapter) {}
    constructor(id: Long, header: HeaderItem?, adapter: ObjectAdapter?) : super(
        id,
        header,
        adapter
    ) {
    }

    constructor(adapter: ObjectAdapter?) : super(adapter) {}

    fun setNumRows(numRows: Int) {
        mNumRows = numRows
    }

    fun getNumRows(): Int {
        return mNumRows
    }

    companion object {
        private val TAG = CustomListRow::class.java.simpleName
    }
}