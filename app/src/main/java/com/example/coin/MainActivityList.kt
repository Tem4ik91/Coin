package com.example.coin

import android.content.Context
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_list.*
import kotlin.random.Random

class MainActivityList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        var arrayList = arrayListOf<String>()
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList)
        ListView.adapter = adapter

        editTextList2.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                arrayList.add(0, editTextList2.getText().toString());
                adapter.notifyDataSetChanged();
                editTextList2.setText("");
                return@OnKeyListener true
            }
            false
        })



            ListView.setOnItemClickListener { _, _, position, _ ->
                adapter.remove(arrayList[position])

            }
        



        buttonList.setOnClickListener {
           if (arrayList.size != 0) {

            val arraySize = arrayList.size
            val randList = Random.nextInt(arraySize)
            estinfo.text = "${arrayList[randList]}"
           }
        }
    }
}
