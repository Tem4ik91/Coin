package com.example.coin

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        coin.setOnClickListener {
            val intent = Intent(this, MainActivityCoin::class.java)
            startActivity(intent)
        }

        list.setOnClickListener {
            val intent = Intent(this, MainActivityList::class.java)
            startActivity(intent)

        }

    }
}
