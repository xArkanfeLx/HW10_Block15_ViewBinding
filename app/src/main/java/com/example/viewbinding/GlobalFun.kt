package com.example.viewbinding

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils

class GlobalFun {
    fun getAnimation(context: Context, path:Int) : Animation {
        return AnimationUtils.loadAnimation(context,path)
    }
}