package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_questionario.*
import java.lang.StringBuilder


class questionario : AppCompatActivity() {

    var contadorCovid: Int = 0
    var contadorDengue: Int = 0
    var contadorH1N1: Int = 0
    var contadorTubercoluse: Int = 0
    var contadorAids: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)


        resultado_questionario.setOnClickListener {
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


            if (contadorDengue >= 3 && contadorCovid < 9) {
                val resultString19 = StringBuilder()
                resultString19.append("É provável que você tenha Dengue, Zika ou Chikungunya")
                textDoenca.text = resultString19.toString()
            }

            else if (contadorH1N1 >= 6 && contadorCovid < 9) {
                val resultString22 = StringBuilder()
                resultString22.append("É provável que você tenha Gripe comum ou H1N1")
                textDoenca.text = resultString22.toString()
            }

            else if (contadorTubercoluse >= 4 && contadorCovid < 9) {
                val resultString25 = StringBuilder()
                resultString25.append("É provável que você tenha Tuberculose")
                textDoenca.text = resultString25.toString()
            }

            else if (contadorAids >= 6 && contadorCovid < 9) {
                val resultString28 = StringBuilder()
                resultString28.append("É provável que você tenha Aids")
                textDoenca.text = resultString28.toString()
            }

            else if (contadorCovid >= 9) {
                val resultString16 = StringBuilder()
                resultString16.append("É provável que você tenha Covid-19")
                textDoenca.text = resultString16.toString()
            }

            else {
                textDoenca.text = "Inconclusivo"
            }

            contadorCovid = 0
            contadorAids = 0
            contadorTubercoluse = 0
            contadorH1N1 = 0
            contadorDengue = 0

        }
    }
}


