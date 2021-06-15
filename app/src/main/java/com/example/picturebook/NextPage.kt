package com.example.picturebook

import android.content.Intent
import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)
        var btnPage=findViewById<Button>(R.id.btnPage2)
        btnPage.setOnClickListener{
            var intent= Intent(baseContext,page3::class.java)
            startActivity(intent)
        }
        var btnBack=findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}