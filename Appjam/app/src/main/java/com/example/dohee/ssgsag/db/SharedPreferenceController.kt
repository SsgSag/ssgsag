package com.example.dohee.ssgsag.db

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private val  IS_FIRST: String = "is_first"

    fun setNotFirst(ctx: Context){
        val preference : SharedPreferences = ctx.getSharedPreferences(IS_FIRST, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putBoolean(IS_FIRST, false)
        editor.commit()
    }

    fun checkFirst(ctx: Context): Boolean {
        val preference : SharedPreferences = ctx.getSharedPreferences(IS_FIRST, Context.MODE_PRIVATE)
        return preference.getBoolean(IS_FIRST, true)
    }
}