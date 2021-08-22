package com.example.projeto_dont_waste.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.projeto_dont_waste.R
import com.example.projeto_dont_waste.databinding.ActivityHomeNaoLogadaBinding
import com.example.projeto_dont_waste.viewmodel.HomeNaoLogadaViewModel

class HomeNaoLogadaFragment : Fragment() {

    companion object {
        fun newInstance() = HomeNaoLogadaFragment()
    }
private lateinit var binding: ActivityHomeNaoLogadaBinding
    private lateinit var viewModel: HomeNaoLogadaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.activity_home_nao_logada, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeNaoLogadaViewModel::class.java)
        binding.viewmodel = viewModel


    }
}