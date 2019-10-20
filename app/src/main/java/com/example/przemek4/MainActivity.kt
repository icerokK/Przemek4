package com.example.przemek4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText("Kocham Cię")

        button.setOnClickListener() {
            startActivity(Intent(this, DrugaAktywnosc::class.java))
        }

        button.setOnLongClickListener(){
            startActivity(Intent(this, CzwartaAktywosc::class.java))
            true}

        textView.setOnClickListener() {
            startActivity(Intent(this, TrzeciaAktywnosc::class.java))
        }
    }
}
