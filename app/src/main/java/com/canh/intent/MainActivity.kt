package com.canh.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.function.IntToDoubleFunction
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_first.setOnClickListener {
            var min = tv_random1.text.toString()
            var max = tv_random2.text.toString()
            var a = Random.nextInt(min.toInt(),max.toInt())
            tv_random3.text= a.toString()
        }
//    btn_first.setOnClickListener {
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://howkteam.com"))
//        startActivity(intent)
//        val intent = Intent(this, SecondScreen::class.java)
//        startActivity(intent)


    }
//        intent(MainActivity.this, SecondScreen.class)


    }
