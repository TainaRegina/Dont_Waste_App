package com.example.projeto_dont_waste.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_dont_waste.MainActivity
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding.bind
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding.inflate
import com.example.projeto_dont_waste.databinding.ActivityMainBinding
import com.example.projeto_dont_waste.databinding.ActivitySegundaTelaDeCadastroBinding
import com.example.projeto_dont_waste.viewmodel.ViewModelCadastro

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private lateinit var viewModel: ViewModelCadastro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(ViewModelCadastro::class.java)
        binding.viewmodel = viewModel



        /**transição para segunda tela de cadastro e retorno ao home
         * @author Tainá e Betriz
         */

        voltarHome()
        proximoCadastro()
        ajuda()
    }


    fun voltarHome() {
        binding.homeCadastroPrimeiraTela.setOnClickListener {
            startActivity(Intent(this, HomeNaoLogadaActivity::class.java))

        }
    }

    fun proximoCadastro() {
        binding.buttonProximoCadastro.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val senha = binding.editTextSenha.text.toString()

            if(email.isEmpty() || senha.isEmpty()){
                Toast.makeText(this, "Preencha todos os dados", Toast.LENGTH_SHORT).show()
            }else{
                startActivity(Intent(this, SegundaTelaDeCadastroActivity::class.java))
                Toast.makeText(this, "Salvo com Sucesso", Toast.LENGTH_SHORT).show()
            }

        }
    }


    fun ajuda() {
        binding.imageViewEsquecisenha.setOnClickListener {
            Toast.makeText(
                this,
                "A senha deve conter de 6 à 8 caracteres numéricos",
                Toast.LENGTH_LONG
            ).show()

        }
    }
}






