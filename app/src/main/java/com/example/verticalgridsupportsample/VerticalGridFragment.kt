package com.example.verticalgridsupportsample

import android.R
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.leanback.app.VerticalGridSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.VerticalGridPresenter

class VerticalGridFragment : VerticalGridSupportFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Title"
        val gridPresenter = VerticalGridPresenter()
        setGridPresenter(gridPresenter)
        val adapter = ArrayObjectAdapter(PizzaCardPresenter())
        setAdapter(adapter)
        adapter.add("Pizza 1")
        adapter.add("Pizza 2")
        adapter.add("Pizza 3")
        adapter.add("Pizza 4")
        adapter.add("Pizza 5")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")
        adapter.add("Pizza 6 with a very long title which will not fit")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnItemViewSelectedListener { _, item, _, row ->
            println("roguin" + item.toString())
        }
    }

    private inner class PizzaCardPresenter : Presenter() {
        override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
            return ViewHolder(ImageCardView(parent.context))
        }

        override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
            val view = viewHolder.view as ImageCardView
            val context = view.context
            val title = item as String
            view.titleText = title
            view.contentText = null
            view.mainImage = context.getDrawable(R.drawable.btn_default)
        }

        override fun onUnbindViewHolder(viewHolder: ViewHolder) {}
    }
}