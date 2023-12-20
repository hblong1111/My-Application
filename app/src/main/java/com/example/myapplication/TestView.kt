package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class TestView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    val root: View

    init {
        root = LayoutInflater.from(context).inflate(R.layout.view_test, this, true)
    }

    fun setNumber(number: Int) {
        root.findViewById<ImageView>(R.id.image2).visibility =
            if (number == 2) View.VISIBLE else View.GONE
    }
}