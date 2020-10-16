package com.example.pitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.example.pitch.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_questionario.*
import kotlinx.android.synthetic.main.activity_main4.*


class questionario : AppCompatActivity() {

    private fun openNextActivity() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    val genero = listOf<String>("Masculino", "Feminino")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

            resultado_questionario.setOnClickListener (View.OnClickListener {
                if (checkBox_Masculino.isChecked) {
                    textView20.text = genero[0]
                } else if (checkBox_Feminino.isChecked) {
                    textView20.text = genero[1]
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox3.isChecked) {
                    return@OnClickListener
                } else if (checkBox4.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                when {
                    checkBox5.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox6.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox7.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox8.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox9.isChecked -> {
                        return@OnClickListener
                    }
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                when {
                    checkBox10.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox11.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox12.isChecked -> {
                        return@OnClickListener
                    }
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox13.isChecked) {
                    return@OnClickListener
                } else if (checkBox14.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox15.isChecked) {
                    return@OnClickListener
                } else if (checkBox16.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox17.isChecked) {
                    return@OnClickListener
                } else if (checkBox18.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox19.isChecked) {
                    return@OnClickListener
                } else if (checkBox20.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox21.isChecked) {
                    return@OnClickListener
                } else if (checkBox22.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox23.isChecked) {
                    return@OnClickListener
                } else if (checkBox24.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                if (checkBox25.isChecked) {
                    return@OnClickListener
                } else if (checkBox26.isChecked) {
                    return@OnClickListener
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                when {
                    checkBox27.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox28.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox29.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox30.isChecked -> {
                        return@OnClickListener
                    }
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                when {
                    checkBox31.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox32.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox33.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox34.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox35.isChecked -> {
                        return@OnClickListener
                    }
                }
            })
            resultado_questionario.setOnClickListener(View.OnClickListener {
                when {
                    checkBox36.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox37.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox38.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox39.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox40.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox41.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox42.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox43.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox44.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox45.isChecked -> {
                        return@OnClickListener
                    }
                    checkBox46.isChecked -> {
                        return@OnClickListener
                    }
                }
            })

            resultado_questionario.setOnClickListener {
                openNextActivity()
            }
        }
    }
