package com.example.coin

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_coin.*
import java.util.*

class MainActivityCoin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coin)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val arrayCoin = arrayOf("ДА","НЕТ")

        buttonCoin.setOnClickListener {

            otvetCoin.text = arrayCoin.random()

        }
    }
}
