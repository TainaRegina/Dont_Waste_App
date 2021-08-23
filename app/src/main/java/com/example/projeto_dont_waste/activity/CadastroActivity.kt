package com.example.projeto_dont_waste.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projeto_dont_waste.databinding.CadastroFragmentBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: CadastroFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CadastroFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)




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





