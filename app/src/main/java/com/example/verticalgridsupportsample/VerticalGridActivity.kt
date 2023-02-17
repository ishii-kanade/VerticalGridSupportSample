package com.example.verticalgridsupportsample

import android.os.Bundle
import androidx.fragment.app.FragmentActivity


class VerticalGridActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vertical_layout)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.vertical_layout_1, VerticalGridFragment())
            .commit()

//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.vertical_layout_2, VerticalGridFragment())
//            .commit()
    }
}