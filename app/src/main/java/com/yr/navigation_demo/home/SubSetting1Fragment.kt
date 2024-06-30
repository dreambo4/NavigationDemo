package com.yr.navigation_demo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.yr.navigation_demo.databinding.FragmentSubSetting1Binding

class SubSetting1Fragment : Fragment() {
    private var _binding: FragmentSubSetting1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSubSetting1Binding.inflate(inflater, container, false)
        val view = binding.root
        val navController = NavHostFragment.findNavController(this)

        return view
    }
}
