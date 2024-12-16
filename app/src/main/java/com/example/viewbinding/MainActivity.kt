package com.example.viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.fragments.LoginFragment
import com.example.viewbinding.fragments.MainFragment
import com.example.viewbinding.fragments.MenuFragment
import com.example.viewbinding.fragments.ProfileFragment
import com.example.viewbinding.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var nextFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startNewFragment(MenuFragment(),0f)
        binding.floatingActionBTN.setOnClickListener{
            startNewFragment(MenuFragment(),0f)
        }
    }

    fun startNewFragment(fragment: Fragment,needScale:Float = 1f) {
        val transaction = this.supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id, fragment)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()

        binding.floatingActionBTN.animate().apply {
            scaleX(needScale)
            scaleY(needScale)
            rotationBy(360f)
            duration = 500
        }
    }

}