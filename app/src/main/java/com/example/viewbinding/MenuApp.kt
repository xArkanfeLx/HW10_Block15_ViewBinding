package com.example.viewbinding

import com.example.viewbinding.fragments.LoginFragment
import com.example.viewbinding.fragments.MainFragment
import com.example.viewbinding.fragments.ProfileFragment
import com.example.viewbinding.fragments.SettingsFragment

class MenuApp {
    companion object {
        val cards = mutableListOf(
            GridViewModal("Главная",R.drawable.menu_img, MainFragment()),
            GridViewModal("Профиль",R.drawable.profile_img,ProfileFragment()),
            GridViewModal("Настройки",R.drawable.settings_img,SettingsFragment()),
            GridViewModal("Выйти",R.drawable.logout_img,LoginFragment())
        )
    }

    fun getAllCards():List<GridViewModal> = cards
}