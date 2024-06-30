package com.yr.mynavigation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.yr.mynavigation.databinding.FragmentBillBinding

class BillFragment : Fragment() {
    private var _binding: FragmentBillBinding? = null
    private val binding get() = _binding!!
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBillBinding.inflate(inflater, container, false)
        val view = binding.root
        val navController = NavHostFragment.findNavController(this)

        return view
    }
}
