package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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


            val pesostr: String = edtpeso.text.toString()
            val alturastr: String = edtaltura.text.toString()

            if (pesostr == "" || alturastr == "") {
                // mensagem para o usuario
                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos!",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val peso = pesostr.toFloat()
                val altura = alturastr.toFloat()


                val calcimc = altura * altura
                val result = peso / calcimc

                //navegar para proxima tela
                // criar o layout da proxima tela
                // passar dados(resultado) para proxima tela
                // Intent - Classe do proprio Android

               val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, result)
                startActivity(intent)
            }
        }

    }
}
