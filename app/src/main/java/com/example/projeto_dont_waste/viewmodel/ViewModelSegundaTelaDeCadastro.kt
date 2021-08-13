package com.example.projeto_dont_waste.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelSegundaTelaDeCadastro: ViewModel(){

    private val _nome = MutableLiveData<String>()
    val nome: LiveData<String> = _nome


}