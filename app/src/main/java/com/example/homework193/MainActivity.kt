package com.example.homework193

import MyFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        view_pager.adapter = MyFragment(supportFragmentManager)


        dots_indicator.setViewPager(view_pager)


    }
}