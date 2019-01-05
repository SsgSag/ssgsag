package com.example.dohee.ssgsag

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.example.dohee.ssgsag.db.SharedPreferenceController
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

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
                    startActivity<LoginActivity>()
                    finish()
                }, 1000)
            }
        }

    }
}