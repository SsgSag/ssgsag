package com.example.dohee.ssgsag.SignUp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.dohee.ssgsag.R
import kotlinx.android.synthetic.main.activity_sign_up1.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import android.view.WindowManager

class SignUp1 : AppCompatActivity() {

    private var id: String = ""
    private var pw: String = ""
    private var pw_check: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up1)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)


        et_id.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })

        et_pw.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })

        et_pw_check.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })
    }

    private fun changeInput(){
        getEditText()
        if (id.equals("") || pw.equals("") || pw_check.equals(""))
            iv_next_1.setImageResource(R.drawable.bt_next_unactive)
        else
            goToNext()
    }


    private fun getEditText() {
        id = et_id.text.toString()
        pw = et_pw.text.toString()
        pw_check = et_pw_check.text.toString()
    }

    private fun goToNext() {
        getEditText()
        if (!id.equals("") && !pw.equals("") && !pw_check.equals("")) {
            iv_next_1.setImageResource(R.drawable.bt_next_active)
            iv_next_1.onClick {
                startActivity<SignUp2>()
                finish()
            }
        }
    }

}
