package com.example.projeto_dont_waste.viewmodel


import android.content.Context
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.SegundaTelaCadastroFragmentBinding
import com.example.projeto_dont_waste.fragment.HomeNaoLogadaFragment
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.android.material.textfield.TextInputEditText

private lateinit var binding: SegundaTelaCadastroFragmentBinding
private lateinit var viewModel: SegundaTelaCadastroViewModel

class SegundaTelaCadastroViewModel(private val fragmentManager: FragmentManager) : ViewModel() {


    private val _onBotaoHome = MutableLiveData<AppCompatImageView>()
    val onBotaoHome: LiveData<AppCompatImageView>
        get() = _onBotaoHome

    private val _onNomeUsuario = MutableLiveData<String>()
    val onNomeUsuario: LiveData<String>
        get() = _onNomeUsuario

    private val _onQuantidadePessoas = MutableLiveData<MaterialAutoCompleteTextView>()
    val onQuantidadePessoas: LiveData<MaterialAutoCompleteTextView>
        get() = _onQuantidadePessoas

    private val _onDataUltimaCompra = MutableLiveData<TextInputEditText>()
    val onDataUltimaCompra: LiveData<TextInputEditText>
        get() = _onDataUltimaCompra

    private val _onFrequenciaCompra = MutableLiveData<MaterialAutoCompleteTextView>()
    val onFrequenciaCompra: LiveData<MaterialAutoCompleteTextView>
        get() = _onFrequenciaCompra


    private val _onBotaoVoltar = MutableLiveData<AppCompatButton>()
    val onBotaoVoltar: LiveData<AppCompatButton>
        get() = _onBotaoVoltar

    private val _onBotaoSalvar = MutableLiveData<AppCompatButton>()
    val onBotaoSalvar: LiveData<AppCompatButton>
        get() = _onBotaoSalvar

    init {
        _onNomeUsuario.value = ""

    }

    fun voltarParaHome() {
        fragmentManager.beginTransaction().addToBackStack("3")
            .replace(R.id.container_fragment, HomeNaoLogadaFragment()).commit()
    }

    fun criacaoListaPessoas(context: Context) {
        val itemPessoas = listOf("1", "2", "3", "Mais de 3")
        val Adapter = ArrayAdapter(context, R.layout.list_item, itemPessoas)
        return binding.textViewQuantidadePessoas.setAdapter(Adapter)
    }


    fun criacaoDatePicker() {
        val datePicker =
            MaterialDatePicker.Builder.datePicker().setTitleText("Selecione a data").build()
        datePicker.show(fragmentManager, "String")
    }

    fun aparecerDatePicker() {
        binding.editTextDataUltimaCompra.setOnFocusChangeListener { view, isFocused ->
            if (view.isInTouchMode && isFocused) {
                view.performClick()
            }
        }
    }


    fun criacaoListaFrequencia(context: Context) {
        val itemsFrequencia = listOf("Semanal", "Quinzenal", "Mensal")
        val adapterFrequencia = ArrayAdapter(context, R.layout.list_item, itemsFrequencia)
        return binding.textInputFrequenciaCompras.setAdapter(adapterFrequencia)
    }


//    fun quantidadePessoas(context: Context){
//    val itemPessoas = listOf("1", "2", "3", "Mais de 3")
//    val Adapter = ArrayAdapter(context, R.layout.list_item, itemPessoas)
//    binding.textViewQuantidadePessoas.setAdapter(Adapter)
//
//    }
//
//    fun dataUltimaCompra(){
//        datePicker.addOnPositiveButtonClickListener {
//            val simpleDateFormat = SimpleDateFormat.getDateInstance()
//            val dateString = simpleDateFormat.format(it)
//            binding.editTextDataUltimaCompra.setText(dateString)
//        }
//    }
//
//    fun frequenciaCompra(){
//
//    }
//
//    fun botaoVoltar(){
//
//    }
//
//    fun botaoSalvar(){
//
//    }


//    fun onNomeUsuario(toString: String) {
//        _onNomeUsuario.value = inputValue
//    }
//
//
//    fun onUsuarioColocaNome(inoutValue: String){
//        this.inputValue = inputValue
//
//
//    }


}