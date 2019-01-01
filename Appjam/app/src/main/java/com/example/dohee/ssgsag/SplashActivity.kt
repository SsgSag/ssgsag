package com.example.dohee.ssgsag

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.dohee.ssgsag.db.SharedPreferenceController
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if(SharedPreferenceController.checkFirst(this)){
            Handler().apply {
                postDelayed({
                    startActivity<InfoActivity>()
                    finish()
                }, 1000)
            }
            SharedPreferenceController.setNotFirst(this)
        } else{
            Handler().apply {
                postDelayed({
                    startActivity<MainActivity>()
                    finish()
                }, 1000)
            }
        }

    }
}