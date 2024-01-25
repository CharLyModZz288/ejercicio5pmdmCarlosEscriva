package com.example.appkotlinempty

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class Activity2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2)

        val btnChangeColor: Button = findViewById(R.id.btnChangeColor)
        val btnGoToActivity1: Button = findViewById(R.id.btnGoToActivity1)

        btnChangeColor.setOnClickListener {
            // Cambiar el color de fondo del cuerpo
            val newColor = getRandomColor()
            findViewById<View>(android.R.id.content).setBackgroundColor(newColor)
        }

        btnGoToActivity1.setOnClickListener {
            // Cambiar a Activity1
            val intent = Intent(this@Activity2, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getRandomColor(): Int {
        // Generar un color aleatorio para el fondo
        val random = java.util.Random()
        return android.graphics.Color.rgb(
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)
        )
    }
}