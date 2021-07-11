package com.alanstd_3.nekodiary.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alanstd_3.nekodiary.R
import com.alanstd_3.nekodiary.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.bind(
            inflater.inflate(R.layout.fragment_home, container, false)
        )
        return binding.root
    }
}