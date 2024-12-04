package com.example.viewbinding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.viewbinding.GridViewAdapter
import com.example.viewbinding.MenuApp
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private var _binding: FragmentMenuBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridGV = binding.gridGV

        //val context: Context? = this.context
        //val context: Context = view.context
        val context: FragmentActivity? = activity
        val adapter = GridViewAdapter(MenuApp().getAllCards(),context!!)
        gridGV.adapter=adapter

        Toast.makeText(view.context,context.toString(),Toast.LENGTH_SHORT).show()
    }
}