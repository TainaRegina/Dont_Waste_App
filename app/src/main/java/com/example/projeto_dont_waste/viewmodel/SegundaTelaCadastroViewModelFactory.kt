package com.example.projeto_dont_waste.viewmodel

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SegundaTelaCadastroViewModelFactory (private val fragmentManager: FragmentManager) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SegundaTelaCadastroViewModel(fragmentManager) as T
    }
}