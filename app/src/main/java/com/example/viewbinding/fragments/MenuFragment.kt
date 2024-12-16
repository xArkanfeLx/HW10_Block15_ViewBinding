package com.example.viewbinding.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.example.viewbinding.GridViewAdapter
import com.example.viewbinding.MainActivity
import com.example.viewbinding.MenuApp
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private val cards = MenuApp().getAllCards()

    private var _binding: FragmentMenuBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridGV = binding.gridGV

        val context: Context = view.context
        val adapter = GridViewAdapter(cards,context)
        gridGV.adapter=adapter

        gridGV.onItemClickListener = AdapterView.OnItemClickListener{ _, _, position, _ ->
            val fragment = cards[position].fragment
            if(cards[position].name == "Выйти") (activity as MainActivity).startNewFragment(fragment,0f)
            else (activity as MainActivity).startNewFragment(fragment)
        }
    }
}