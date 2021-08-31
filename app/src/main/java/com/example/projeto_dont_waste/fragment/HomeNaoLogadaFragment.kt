package com.example.projeto_dont_waste.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.HomeNaoLogadaFragmentBinding
import com.example.projeto_dont_waste.viewmodel.HomeNaoLogadaViewModel
import com.example.projeto_dont_waste.viewmodel.HomeNaoLogadaViewModelFactory


class HomeNaoLogadaFragment : Fragment() {

    companion object {
        fun newInstance() = HomeNaoLogadaFragment()
    }

    private lateinit var binding: HomeNaoLogadaFragmentBinding
    private lateinit var viewModel: HomeNaoLogadaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.home_nao_logada_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this,HomeNaoLogadaViewModelFactory(parentFragmentManager)).get(HomeNaoLogadaViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        binding.buttonPrimeiroAcesso.setOnClickListener {
            viewModel.onClickTelaCadastro()
        }

    }
}