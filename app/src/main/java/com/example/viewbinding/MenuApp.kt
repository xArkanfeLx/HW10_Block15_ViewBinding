package com.example.viewbinding

import com.example.viewbinding.fragments.MenuFragment

class MenuApp {
    companion object {
        val cards = mutableListOf(
            GridViewModal("Главная",R.drawable.menu_img,MenuFragment()),
            GridViewModal("Профиль",R.drawable.profile_img,MenuFragment()),
            GridViewModal("Настройки",R.drawable.settings_img,MenuFragment()),
            GridViewModal("Выйти",R.drawable.logout_img,MenuFragment())
        )
    }

    fun getAllCards():List<GridViewModal> = cards
}