package com.finishapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.finishapp.databinding.RegistrationFragmentBinding


class RegistrationFragment : Fragment() {

    private lateinit var binding: RegistrationFragmentBinding


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
        init()
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(requireContext())
            rcView.adapter = BrandAdapter()
        }
    }


}