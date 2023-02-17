package com.example.verticalgridsupportsample

import androidx.leanback.widget.ListRowPresenter

import androidx.leanback.widget.RowPresenter


class CustomListRowPresenter : ListRowPresenter() {
    override fun onBindRowViewHolder(holder: RowPresenter.ViewHolder, item: Any) {
        /* This two line codes changes the number of rows of ListRow */
        val numRows = (item as CustomListRow).getNumRows()
        (holder as ViewHolder).gridView.setNumRows(numRows)
        super.onBindRowViewHolder(holder, item)
    }

    override fun initializeRowViewHolder(holder: RowPresenter.ViewHolder) {
        super.initializeRowViewHolder(holder)
        /* Disable Shadow */
        // setShadowEnabled(false);
    }

    companion object {
        private val TAG = CustomListRowPresenter::class.java.simpleName
    }
}