package com.lolchess.strategy.util

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

class Preferenceutil (var context:Context){
    private val prefs: SharedPreferences = context.getSharedPreferences("prefs_name", Context.MODE_PRIVATE)

    fun getString(key: String, defValue: String): String { return prefs.getString(key, defValue).toString() }

    fun setString(key: String, str: String) {
        if(prefs.all.size >= 11)
            Toast.makeText(context, "챔프를 10개 이상 등록 할 수 없습니다.", Toast.LENGTH_LONG).show()
        else if(str.equals(getString("champ",str))){
            Toast.makeText(context, "이미 같은 챔프가 존재합니다.", Toast.LENGTH_LONG).show()
        }
        else{
            prefs.edit().putString(key, str).apply()
        }
    }

    fun deleteString(key:String, str:String){
        prefs.edit().remove("champ").commit()
    }
}