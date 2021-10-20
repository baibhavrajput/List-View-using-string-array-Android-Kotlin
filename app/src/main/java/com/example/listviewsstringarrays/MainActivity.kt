package com.example.listviewsstringarrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cities = arrayOf<String>(
            "Delhi", "Mumbai" , "Kolkata" , "Bokaro","Delhi", "Mumbai" , "Kolkata" , "Bokaro","Delhi", "Mumbai" , "Kolkata" , "Bokaro","Delhi", "Mumbai" , "Kolkata" , "Bokaro"
        )

        lv_cityNames.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            cities,
        )
    }
}