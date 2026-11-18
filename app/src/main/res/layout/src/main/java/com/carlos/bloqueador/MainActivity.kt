package com.carlos.bloqueador

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSeleccionar = findViewById<Button>(R.id.btnSeleccionar)
        val btnActivar = findViewById<Button>(R.id.btnActivar)

        btnSeleccionar.setOnClickListener {
            Toast.makeText(this, "Selección de apps próximamente", Toast.LENGTH_SHORT).show()
        }

        btnActivar.setOnClickListener {
            Toast.makeText(this, "Bloqueo estricto activado", Toast.LENGTH_SHORT).show()
        }
    }
}
