package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // criar uma variavel e associar o componente de UI<EditText>
        //recuperar o botao da tela
        // colocar ação do botão setOnClickLister
        // Recuperar o texto digitado no edtpeso

        val edtpeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edittext_altura)
        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
            println("peso digitado: $peso, altura digitada: $altura")

        }

    }
}