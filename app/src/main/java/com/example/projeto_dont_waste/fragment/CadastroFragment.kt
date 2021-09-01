package com.example.projeto_dont_waste.fragment

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.CadastroFragmentBinding
import com.example.projeto_dont_waste.viewmodel.CadastroViewModel


class CadastroFragment : Fragment() {
    companion object {
        fun newInstance() = CadastroFragment()
    }

    private lateinit var viewModel: CadastroViewModel
    private lateinit var binding: CadastroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.cadastro_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(
            CadastroViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        binding.homeCadastroPrimeiraTela.setOnClickListener{
            parentFragmentManager.beginTransaction().replace(R.id.activity_container, HomeNaoLogadaFragment()).commit()
        }

        binding.buttonProximoCadastro.setOnClickListener {
           parentFragmentManager.beginTransaction().replace(R.id.activity_container, SegundaTelaCadastroFragment()).commit()
        }
    }


}