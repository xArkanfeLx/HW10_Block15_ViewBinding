package com.example.viewbinding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbinding.GlobalFun
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private var _binding: FragmentSettingsBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.set1TV.startAnimation(GlobalFun().getAnimation(view.context,R.anim.move_down_up))
        binding.set2TV.startAnimation(GlobalFun().getAnimation(view.context,R.anim.move_down_up))
    }
}