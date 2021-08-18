package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.projeto_dont_waste.MainActivity
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
         * @author Tainá e Beatriz
         */

        voltarHome()
        voltarTelaCadastro()
        salvar()
    }

    fun voltarHome() {
        binding.homeCadastroSegundaTela.setOnClickListener {
            startActivity(Intent(this, HomeNaoLogadaActivity::class.java))

        }
    }

    fun voltarTelaCadastro() {
        binding.btVoltar.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))

        }
    }

    fun salvar() {
        binding.btSalvarCadastro.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "Salvo com Sucesso", LENGTH_SHORT).show()
        }
    }
}



