package com.example.dohee.ssgsag

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup4.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class Signup4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup4)
        setOnBtnClickListener()
    }

    private fun setOnBtnClickListener(){
        btn_back_4.setOnClickListener {
            startActivity<Signup3Activity>()
            finish()
        }
        btn_start4.setOnClickListener {
            startActivity<MainActivity>()
            finish()
        }
        experience_plus_1.setOnClickListener {
            toast("추가")
        }
        certificate_plus_1.setOnClickListener {
            toast("추가")
        }
        awards_plus_1.setOnClickListener {
            toast("추가")
        }
    }
}
