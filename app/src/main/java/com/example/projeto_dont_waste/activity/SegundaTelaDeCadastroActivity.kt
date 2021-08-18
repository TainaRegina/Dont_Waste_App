package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.projeto_dont_waste.MainActivity
import com.example.projeto_dont_waste.R
import android.widget.ArrayAdapter
import com.example.projeto_dont_waste.databinding.ActivitySegundaTelaDeCadastroBinding
import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat


class SegundaTelaDeCadastroActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySegundaTelaDeCadastroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela_de_cadastro)

        binding = ActivitySegundaTelaDeCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /**transição para tela de home e retorno para primeira tela de cadastro
         * @author Tainá e Beatriz
         */

        /** opções de menu e data alocadas nos campos de interação
         * @author Gustavo
         */


        voltarHome()
        voltarTelaCadastro()
        salvar()


        //gerencia o spinner(lista de opção) com a quantidade de pessoas que residem na casa
        val itemsPessoas = listOf("1", "2", "3", "Mais de 3")
        val adapterPessoas = ArrayAdapter(this, R.layout.list_item, itemsPessoas)
        binding.textViewQuantidadePessoas?.setAdapter(adapterPessoas)

        //o date picker, para conseguir puxar o calendario
        val datePicker =
            MaterialDatePicker.Builder.datePicker().setTitleText("Selecione a data").build()


        //quando clica em ok ao escolher uma data no date picker
        datePicker.addOnPositiveButtonClickListener {

            val simpleDateFormat = SimpleDateFormat.getDateInstance()
            val dateString = simpleDateFormat.format(it)
            binding.editTextDataUltimaCompra.setText(dateString)
        }


        //metodo para o date picker aparecer corretamente
        binding.editTextDataUltimaCompra.setOnFocusChangeListener { view, isFocused ->
            if (view.isInTouchMode && isFocused) {
                view.performClick()
            }

        }

        //mostrar o date picker ao clicar no edit text
        binding.editTextDataUltimaCompra.setOnClickListener {
            datePicker.show(supportFragmentManager, "tag")
        }

        //genrencia o spinner da frequencia de compras
        val itemsFrequencia = listOf("Semanal", "Quinzenal", "Mensal")
        val adapterFrequencia = ArrayAdapter(this, R.layout.list_item, itemsFrequencia)
        binding.textInputFrequenciaCompras?.setAdapter(adapterFrequencia)


    }

    fun voltarTelaCadastro() {
        binding.btVoltar.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))

        }
    }

    fun salvar() {
        binding.btSalvar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "Salvo com Sucesso", LENGTH_SHORT).show()
        }
    }

    fun voltarHome() {
        binding.imageViewHome.setOnClickListener {
            startActivity(Intent(this, HomeNaoLogadaActivity::class.java))

        }
    }
}



