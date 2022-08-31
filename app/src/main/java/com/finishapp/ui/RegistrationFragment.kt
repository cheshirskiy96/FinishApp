package com.finishapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.finishapp.BrandInfo
import com.finishapp.BrandListViewModel
import com.finishapp.databinding.RegistrationFragmentBinding
import com.finishapp.repository.Repository
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel


class RegistrationFragment : Fragment() {

    private lateinit var binding: RegistrationFragmentBinding
    private var adapter:BrandAdapter = BrandAdapter()
    private val brandList = listOf<BrandInfo>(
    )




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegistrationFragmentBinding.inflate(inflater)
        init()
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = RegistrationFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(requireContext())
            rcView.adapter = adapter

        }
    }


}