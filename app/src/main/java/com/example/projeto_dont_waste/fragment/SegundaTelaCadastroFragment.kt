package com.example.projeto_dont_waste.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.viewmodel.SegundaTelaCadastroViewModel

class SegundaTelaCadastroFragment : Fragment() {

    companion object {
        fun newInstance() = SegundaTelaCadastroFragment()
    }

    private lateinit var viewModel: SegundaTelaCadastroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.segunda_tela_cadastro_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SegundaTelaCadastroViewModel::class.java)
        // TODO: Use the ViewModel
    }

}