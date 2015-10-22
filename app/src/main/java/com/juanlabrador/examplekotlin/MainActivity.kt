package com.juanlabrador.examplekotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.activity_main.name
import kotlinx.android.synthetic.activity_main.nameUpdate
import kotlinx.android.synthetic.activity_main.button

/**
 * Created by juanlabrador on 22/10/15.
 */
class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name.text = "Hello world!!!!!!!";
        nameUpdate.text = name.text as String + " fuckers!!!!!"

        button.setOnClickListener {
            Snackbar.make(button, "Hellou", Snackbar.LENGTH_SHORT).show()
            //startActivity(Intent(this, ShowActivity::class.java).putExtra("tag", "From Intent!"))
        }
    }
}