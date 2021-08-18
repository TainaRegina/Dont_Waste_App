package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projeto_dont_waste.MainActivity
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding
import com.example.projeto_dont_waste.databinding.ActivityHomeNaoLogadaBinding


class HomeNaoLogadaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeNaoLogadaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeNaoLogadaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /** função inicial, transição para telas de cadastro e tela de login
         * @author Tainá e Beatriz
         */


        fazerCadastro()
        fazerLogin()
    }


    fun fazerCadastro() {
        binding.buttonPrimeiroAcesso.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))

        }
    }

    fun fazerLogin() {
        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }

    }
}