package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_questionario.*
import java.lang.StringBuilder


class questionario : AppCompatActivity() {

    var contadorCovid: Int = 0
    var contadorDengue: Int = 0
    var contadorH1N1: Int = 0
    var contadorTubercoluse: Int = 0
    var contadorAids: Int = 0

    private fun openNextActivity2() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

        resultado_questionario.setOnClickListener {
            val resultString15 = StringBuilder()
            if (tosse.isChecked) {
                contadorCovid++
                contadorH1N1++
                contadorTubercoluse++
            }
            if (gripe.isChecked) {
                contadorCovid++
                contadorAids++
                contadorH1N1++
            }
            if (nauseas.isChecked) {
                contadorCovid++
                contadorAids++
                contadorH1N1++
            }
            if (dores_corpo.isChecked) {
                contadorCovid++
                contadorDengue++
                contadorAids++
                contadorH1N1++
                contadorTubercoluse++
            }
            if (febre.isChecked) {
                contadorCovid++
                contadorDengue++
                contadorAids++
                contadorTubercoluse++
            }
            if (diarreia.isChecked) {
                contadorCovid++
                contadorAids++
                contadorH1N1++
            }
            if (dor_garganta.isChecked) {
                contadorCovid++
                contadorAids++
                contadorH1N1++
            }
            if (fraqueza_muscular.isChecked) {
                contadorDengue++
                contadorH1N1++
            }
            if (falta_ar.isChecked) {
                contadorCovid++
            }
            if (perda_paladar.isChecked) {
                contadorCovid++
                contadorTubercoluse++
            }
            if (perda_oufato.isChecked) {
                contadorCovid++
            }


            if (contadorCovid >= 9) {
                val resultString16 = StringBuilder()
                resultString16.append("É muito provável que você tenha Covid-19")
                textDoenca.text = resultString16.toString()
            } else if (contadorCovid >= 5) {
                val resultString17 = StringBuilder()
                resultString17.append("É provável que você tenha Covid-19")
                textDoenca.text = resultString17.toString()
            } else if (contadorCovid <= 2) {
                val resultString18 = StringBuilder()
                resultString18.append("É pouco provável que você tenha Covid-19")
                textDoenca.text = resultString18.toString()
            } else if (contadorDengue >= 3) {
                val resultString19 = StringBuilder()
                resultString19.append("É muito provável que você tenha Dengue, Zika ou Chikungunya")
                textDoenca.text = resultString19.toString()
            } else if (contadorDengue >= 2) {
                val resultString20 = StringBuilder()
                resultString20.append("É provável que você tenha Dengue, Zika ou Chikungunya")
                textDoenca.text = resultString20.toString()
            } else if (contadorDengue <= 1) {
                val resultString21 = StringBuilder()
                resultString21.append("É pouco provável que você tenha Dengue, Zika ou Chikungunya")
                textDoenca.text = resultString21.toString()
            } else if (contadorH1N1 >= 6) {
                val resultString22 = StringBuilder()
                resultString22.append("É muito provável que você tenha Gripe comum ou H1N1")
                textDoenca.text = resultString22.toString()
            } else if (contadorH1N1 >= 3) {
                val resultString23 = StringBuilder()
                resultString23.append("É provável que você tenha Gripe comum ou H1N1")
                textDoenca.text = resultString23.toString()
            } else if (contadorH1N1 <= 1) {
                val resultString24 = StringBuilder()
                resultString24.append("É pouco provável que você tenha Gripe comum ou H1N1")
                textDoenca.text = resultString24.toString()
            } else if (contadorTubercoluse >= 4) {
                val resultString25 = StringBuilder()
                resultString25.append("É muito provável que você tenha Tuberculose")
                textDoenca.text = resultString25.toString()
            } else if (contadorTubercoluse >= 2) {
                val resultString26 = StringBuilder()
                resultString26.append("É provável que você tenha Tuberculose")
                textDoenca.text = resultString26.toString()
            } else if (contadorTubercoluse <= 1) {
                val resultString27 = StringBuilder()
                resultString27.append("É provável que você tenha Tuberculose")
                textDoenca.text = resultString27.toString()
            } else if (contadorAids >= 6) {
                val resultString28 = StringBuilder()
                resultString28.append("É muito provável que você tenha Aids")
                textDoenca.text = resultString28.toString()
            } else if (contadorAids >= 3) {
                val resultString29 = StringBuilder()
                resultString29.append("É provável que você tenha Aids")
                textDoenca.text = resultString29.toString()
            } else if (contadorAids <= 1) {
                val resultString30 = StringBuilder()
                resultString30.append("É pouco provável que você tenha Aids")
                textDoenca.text = resultString30.toString()
            } else {
                textDoenca.text = "Doença indefinida"
            }
        }
        contadorCovid = 0
        contadorAids = 0
        contadorTubercoluse = 0
        contadorH1N1 = 0
        contadorDengue = 0
    }
}
