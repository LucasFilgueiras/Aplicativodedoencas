package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import com.example.pitch.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_questionario.*
import kotlinx.android.synthetic.main.activity_main4.*
import java.lang.StringBuilder


class questionario : AppCompatActivity() {

    private fun openNextActivity() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

        resultado_questionario.setOnClickListener {
            val resultString = StringBuilder()
            if (checkBox_Masculino.isChecked) {
                resultString.append("Masculino")
            }
            if (checkBox_Feminino.isChecked) {
                resultString.append("Feminino")
            }
            textGenero.text = resultString.toString()

            val resultString2 = StringBuilder()
            if (checkBox1.isChecked) {
                resultString2.append("Sim")
            }
            if (checkBox2.isChecked) {
                resultString2.append("Não")
            }
            textFebre.text = resultString2.toString()

            val resultString3 = StringBuilder()
            if (checkBox3.isChecked) {
                resultString3.append("Sim")
            }
            if (checkBox4.isChecked) {
                resultString3.append("Não")
            }
            textCoriza.text = resultString3.toString()

            val resultString4 = StringBuilder()
            if (checkBox5.isChecked) {
                resultString4.append("Não tenho sintomas")
            }
            if (checkBox6.isChecked) {
                resultString4.append("Ontem")
            }
            if (checkBox7.isChecked) {
                resultString4.append("Há 2 dias")
            }
            if (checkBox8.isChecked) {
                resultString4.append("Há 3 dias")
            }
            if (checkBox9.isChecked) {
                resultString4.append("Há 4 dias ou mais")
            }
            textSintomas.text = resultString4.toString()

            val resultString5 = StringBuilder()
            if (checkBox10.isChecked) {
                resultString5.append("Sim,fiquei em casa")
            }
            if (checkBox11.isChecked) {
                resultString5.append("Sai apenas para o trabalho/mercado/farmácia")
            }
            if (checkBox12.isChecked) {
                resultString5.append("Não fiquei")
            }
            textCasa.text = resultString5.toString()

            val resultString6 = StringBuilder()
            if (checkBox13.isChecked) {
                resultString6.append("Sim")
            }
            if (checkBox14.isChecked) {
                resultString6.append("Não")
            }
            textContato.text = resultString6.toString()

            val resultString7 = StringBuilder()
            if (checkBox15.isChecked) {
                resultString7.append("Sim")
            }
            if (checkBox16.isChecked) {
                resultString7.append("Não")
            }
            textPressao.text = resultString7.toString()

            val resultString8 = StringBuilder()
            if (checkBox17.isChecked) {
                resultString8.append("Sim")
            }
            if (checkBox18.isChecked) {
                resultString8.append("Não")
            }
            textDiabete.text = resultString8.toString()

            val resultString9 = StringBuilder()
            if (checkBox19.isChecked) {
                resultString9.append("Sim")
            }
            if (checkBox20.isChecked) {
                resultString9.append("Não")
            }
            textSatisfeito.text = resultString9.toString()

            val resultString10 = StringBuilder()
            if (checkBox21.isChecked) {
                resultString10.append("Sim")
            }
            if (checkBox22.isChecked) {
                resultString10.append("Não")
            }
            textInjetavel.text = resultString10.toString()

            val resultString11 = StringBuilder()
            if (checkBox23.isChecked) {
                resultString11.append("Sim")
            }
            if (checkBox24.isChecked) {
                resultString11.append("Não")
            }
            textSexual.text = resultString11.toString()

            val resultString12 = StringBuilder()
            if (checkBox25.isChecked) {
                resultString12.append("Sim")
            }
            if (checkBox26.isChecked) {
                resultString12.append("Não")
            }
            textParceiro.text = resultString12.toString()

            val resultString13 = StringBuilder()
            if (checkBox27.isChecked) {
                resultString13.append("Arritmia Cardíaca")
            }
            if (checkBox28.isChecked) {
                resultString13.append("Insuficiência cardíaca")
            }
            if (checkBox29.isChecked) {
                resultString13.append("Infarto")
            }
            if (checkBox30.isChecked) {
                resultString13.append("Nenhum")
            }
            textCoracao.text = resultString13.toString()

            val resultString14 = StringBuilder()
            if (checkBox31.isChecked) {
                resultString14.append("Asma")
            }
            if (checkBox32.isChecked) {
                resultString14.append("Rinite")
            }
            if (checkBox33.isChecked) {
                resultString14.append("Bronquite")
            }
            if (checkBox34.isChecked) {
                resultString14.append("DPOC - Doença Pulmonar Obstrutiva Crônica")
            }
            if (checkBox35.isChecked) {
                resultString14.append("Enfisema")
            }
            if (checkBox.isChecked){
                resultString14.append("Nenhum")
            }
            textRespiratorio.text = resultString14.toString()

            val resultString15 = StringBuilder()
            if (checkBox36.isChecked) {
                resultString15.append("Tosse")
            }
            if (checkBox37.isChecked) {
                resultString15.append("Gripe")
            }
            if (checkBox38.isChecked) {
                resultString15.append("Náuseas")
            }
            if (checkBox39.isChecked) {
                resultString15.append("Dores no corpo")
            }
            if (checkBox40.isChecked) {
                resultString15.append("Febre")
            }
            if (checkBox41.isChecked) {
                resultString15.append("Diarréia")
            }
            if (checkBox42.isChecked) {
                resultString15.append("Dor de garganta")
            }
            if (checkBox43.isChecked) {
                resultString15.append("Fraqueza muscular")
            }
            if (checkBox44.isChecked) {
                resultString15.append("Falta de ar")
            }
            if (checkBox45.isChecked) {
                resultString15.append("Perda do paladar")
            }
            if (checkBox46.isChecked) {
                resultString15.append("Perda do oufato")
            }
            textSintomas2.text = resultString15.toString()
        }
    }
}
