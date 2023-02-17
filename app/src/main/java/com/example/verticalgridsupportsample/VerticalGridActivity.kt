package com.example.verticalgridsupportsample

import android.os.Bundle
import androidx.fragment.app.FragmentActivity


class VerticalGridActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_browse_fragment, VerticalGridFragment())
            .commit()
    }
}