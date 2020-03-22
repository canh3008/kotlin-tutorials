package com.canh.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.function.IntToDoubleFunction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btn_first.setOnClickListener {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://howkteam.com"))
        startActivity(intent)
//        val intent = Intent(this, SecondScreen::class.java)
//        startActivity(intent)


    }
//        intent(MainActivity.this, SecondScreen.class)


    }
}