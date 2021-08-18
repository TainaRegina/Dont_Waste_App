package com.example.projeto_dont_waste.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityCadastroBinding
import com.example.projeto_dont_waste.databinding.ActivitySegundaTelaDeCadastroBinding
import android.util.Log
import android.widget.ArrayAdapter
import com.google.android.material.datepicker.MaterialDatePicker
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_segunda_tela_de_cadastro.*
import java.text.SimpleDateFormat
import java.util.*


class SegundaTelaDeCadastroActivity : AppCompatActivity() {


   // private lateinit var binding: ActivitySegundaTelaDeCadastroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela_de_cadastro)

//        binding = ActivitySegundaTelaDeCadastroBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        /**transição para tela de home e retorno para primeira tela de cadastro
         * @authorTainá
         */

//        voltarHome()
//        voltarTelaCadastro()
//    }
//
//    fun voltarHome () {
//        binding.homeCadastroSegundaTela.setOnClickListener {
//            val home = Intent(this, HomeNaoLogadaActivity::class.java)
//            startActivity(home)
//
//        }
//    }
//
//    fun voltarTelaCadastro() {
//        binding.btVoltar.setOnClickListener {
//            val voltar = Intent(this, CadastroActivity::class.java)
//            startActivity(voltar)
//        }

        //gerencia o spinner(lista de opção) com a quantidade de pessoas que residem na casa
        val itemsPessoas = listOf("1", "2", "3", "Mais de 3")
        val adapterPessoas = ArrayAdapter(this, R.layout.list_item, itemsPessoas)
        materialAutoCompleteTextView?.setAdapter(adapterPessoas)

        //o date picker, para conseguir puxar o calendario
        val datePicker = MaterialDatePicker.Builder.datePicker() .setTitleText("Selecione a data").build()

        //quando clica em ok ao escolher uma data no date picker
        datePicker.addOnPositiveButtonClickListener {

            val simpleDateFormat = SimpleDateFormat.getDateInstance()
            val dateString = simpleDateFormat.format(it)
            lastPurchaseEditText.setText(dateString)
        }

        //metodo para o date picker aparecer corretamente
        lastPurchaseEditText.setOnFocusChangeListener { view, isFocused ->
            if (view.isInTouchMode && isFocused) {
                view.performClick()
            }
        }

        //mostrar o date picker ao clicar no edit text
        lastPurchaseEditText.setOnClickListener {
            datePicker.show(supportFragmentManager, "tag")
        }

        //genrencia o spinner da frequencia de compras
        val itemsFrequencia = listOf("Semanal", "Quinzenal", "Mensal")
        val adapterFrequencia = ArrayAdapter(this, R.layout.list_item, itemsFrequencia)
        materialAutoCompleteTextView2?.setAdapter(adapterFrequencia)


    }
}



