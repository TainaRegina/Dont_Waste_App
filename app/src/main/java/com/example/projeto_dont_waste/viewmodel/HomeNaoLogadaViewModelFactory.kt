package com.example.projeto_dont_waste.viewmodel

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HomeNaoLogadaViewModelFactory(private val fragmentManager: FragmentManager) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeNaoLogadaViewModel(fragmentManager) as T
    }
}