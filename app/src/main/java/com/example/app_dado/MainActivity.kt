package com.example.app_dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    val dado = arrayOf(R.drawable.lado1,R.drawable.lado2,R.drawable.lado3,
    R.drawable.lado4,R.drawable.lado5,R.drawable.lado6)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJogar = this.findViewById<Button>(R.id.btnJogar)
        btnJogar.setOnClickListener{

            val imgInicio = this.findViewById<ImageView>(R.id.imgInicio)

            val valor= (0..5).random()

            imgInicio.setImageResource(dado[valor])



        }

        }

    }
