package com.example.viewbinding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbinding.GlobalFun
import com.example.viewbinding.MainActivity
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginET.startAnimation(GlobalFun().getAnimation(view.context,R.anim.move_down_up))
        binding.passET.startAnimation(GlobalFun().getAnimation(view.context,R.anim.move_down_up))
        binding.loginBTN.startAnimation(GlobalFun().getAnimation(view.context,R.anim.move_down_up))
        binding.loginBTN.setOnClickListener{
            if(binding.loginET.text.isNotEmpty() && binding.passET.text.isNotEmpty()){
                (activity as MainActivity).startNewFragment(MenuFragment(),0f)
            }
        }
    }
}