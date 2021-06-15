package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        var btnPage4=findViewById<Button>(R.id.btnButton2)
        btnPage4.setOnClickListener{
            var intent= Intent(baseContext,page5::class.java)
            startActivity(intent)

    }
        var btnPage3=findViewById<Button>(R.id.btnback)
        btnPage3.setOnClickListener {
            var intent=Intent(baseContext,page3::class.java)
            startActivity(intent)
        }
}
}