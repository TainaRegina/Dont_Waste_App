package com.example.projeto_dont_waste.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding
import com.example.projeto_dont_waste.databinding.ActivityMainBinding

class CadastroActivity : AppCompatActivity() {

private lateinit var binding: ActivityCadastroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /**transição para segunda tela de cadastro e retorno ao home
         * @authorTainá
         */

        voltarHome()
        proximoCadastro()
    }


    fun voltarHome() {
            binding.homeCadastroPrimeiraTela.setOnClickListener {
                val home = Intent(this, HomeNaoLogadaActivity::class.java)
                startActivity(home)

        }
    }

        fun proximoCadastro() {
           binding.buttonProximoCadastro.setOnClickListener {
                val proximo = Intent(this, SegundaTelaDeCadastroActivity::class.java)
                startActivity(proximo)
            }
        }
    }





