package com.juanlabrador.examplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.activity_show.text

/**
 * Created by juanlabrador on 22/10/15.
 */
class ShowActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        text.text = intent.getStringExtra("tag");
    }
}