package com.marisaatnita.mainstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_jumlah_pengikut = findViewById<TextView>(R.id.lbl_jumlah_pengikut)
        val btn_ikuti = findViewById<Button>(R.id.btn_ikuti)

        btn_ikuti.setOnClickListener {
            lbl_jumlah_pengikut.text = "4.546"
            btn_ikuti.text = "mengikuti"
        }
    }
}