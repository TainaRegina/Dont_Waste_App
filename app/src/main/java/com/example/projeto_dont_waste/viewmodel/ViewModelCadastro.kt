package com.example.projeto_dont_waste.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ViewModelCadastro : ViewModel() {

    private val _email = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email

    private val _senha = MutableLiveData<Int>()
    val senha: LiveData<Int>
        get() = _senha
    init {
        _email.value = ""
         _senha.value = 0
    }

    fun validarSenha() {
        if (_senha.value.toString().length >= 6 && _senha.value.toString().length <= 8 ){

        }
    }
}









