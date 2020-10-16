package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pitch.questionario
import kotlinx.android.synthetic.main.activity_inicial.*

class inicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        questionario_botao.setOnClickListener {
            val intent = Intent(this, questionario::class.java)
            startActivity(intent)
        }
        pular_botao.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }

    }
}