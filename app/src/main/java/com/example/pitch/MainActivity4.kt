package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pitch.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_questionario.*
import kotlinx.android.synthetic.main.activity_main4.*
import java.lang.StringBuilder

class MainActivity4 : AppCompatActivity() {

    private fun openNextActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        Voltar.setOnClickListener {
            openNextActivity()
        }


    }
}