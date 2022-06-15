package com.example.valentictactu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val kirim = findViewById<Button>(R.id.btnCreator)
        kirim.setOnClickListener {
            send()


        }
    }

    private fun send() {
        val intent = Intent(this, creator::class.java)
        startActivity(intent)
    }
}

// Rangkuman pada about ini terdapat variable kirim yang antinya akan menuju ke activity selanjutnya dengan mengklik btn creator, lalu terdapat private val send yang apabila val kirim tadi dilakukan maka akan berganti e activity creator