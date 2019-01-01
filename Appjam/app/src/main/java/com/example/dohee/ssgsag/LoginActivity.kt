package com.example.dohee.ssgsag

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dohee.ssgsag.SignUp.SignUp3
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    var auto_click: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setOnBtnClickListener()
    }

    private fun setOnBtnClickListener() {
        btn_auto_login.setOnClickListener {
            auto_click = 1 - auto_click
            if (auto_click == 1){
                btn_auto_login_img.setImageResource(R.drawable.checkbox_round_active)
            } else {btn_auto_login_img.setImageResource(R.drawable.checkbox_round)}
        }

        btn_forgot_pw.setOnClickListener {
            toast("비밀번호 찾기")
        }

        btn_login.setOnClickListener {
            toast("로그인")
            startActivity<MainActivity>()
            finish()
        }

        btn_login_signup.setOnClickListener {
            toast("회원가입")
            startActivity<SignUp3>()
            finish()
        }
    }

}
