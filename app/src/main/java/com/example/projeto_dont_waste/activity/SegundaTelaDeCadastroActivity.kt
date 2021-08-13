package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding
import com.example.projeto_dont_waste.databinding.ActivitySegundaTelaDeCadastroBinding


class SegundaTelaDeCadastroActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySegundaTelaDeCadastroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaDeCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**transição para tela de home e retorno para primeira tela de cadastro
         * @authorTainá
         */

        voltarHome()
        voltarTelaCadastro()
    }

    fun voltarHome () {
        binding.homeCadastroSegundaTela.setOnClickListener {
            val home = Intent(this, HomeNaoLogadaActivity::class.java)
            startActivity(home)

        }
    }

    fun voltarTelaCadastro() {
        binding.btVoltar.setOnClickListener {
            val voltar = Intent(this, CadastroActivity::class.java)
            startActivity(voltar)
        }
    }
}



