package com.ummetyildirim.yabancidilogren

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.meslekbtn)
        button.setOnClickListener(){
            val intent = Intent (this,meslekler::class.java)
            startActivity(intent)

        }
        val buton2 = findViewById<Button>(R.id.rakambtn)
        buton2.setOnClickListener(){
            val intent = Intent (this,rakamlar::class.java)
            startActivity(intent)
        }

        val buton3 = findViewById<Button>(R.id.renklerbtn)

        buton3.setOnClickListener(){
            val intent = Intent (this,renkler::class.java)
            startActivity(intent)
        }

        val buton4 = findViewById<Button>(R.id.meyvelerbtn)
        buton4.setOnClickListener(){
            val intent = Intent (this,meyveler::class.java)
            startActivity(intent)
        }


    }
}