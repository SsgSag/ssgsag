package com.example.dohee.ssgsag.SignUp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import com.example.dohee.ssgsag.R
import kotlinx.android.synthetic.main.activity_sign_up2.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class SignUp2 : AppCompatActivity() {
    private var name: String = ""
    private var birth: String = ""
    private var email: String = ""
    private var fbtn: Int = 0
    private var mbtn: Int = 0
    private var btn: Int = 0

    override fun onBackPressed() {
        startActivity<SignUp1>()
        finish()
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        iv_back_2.onClick {
            startActivity<SignUp1>()
//            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.exit_out_left)
            finish()
        }

        iv_female.onClick {
            iv_female.setImageResource(R.drawable.bt_female_active)
            iv_male.setImageResource(R.drawable.bt_male_unactive)
            fbtn++
            mbtn=0
            btn++
//            clearFocus()
            goToNext()
        }
        iv_male.onClick {
            iv_male.setImageResource(R.drawable.bt_male_active)
            iv_female.setImageResource(R.drawable.bt_female_unactive)
            mbtn++
            fbtn=0
            btn++
//            clearFocus()
            goToNext()
        }

        cb_service_privacy.onClick {
            if (cb_service_privacy.isChecked)
                goToNext()
            else
                changeInput()
        }

        et_name.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })

        et_birth.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })

        et_email.addTextChangedListener(object : TextWatcher {
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
        if (name.equals("") || birth.equals("") || email.equals("")||btn==0||!cb_service_privacy.isChecked)
            iv_next_2.setImageResource(R.drawable.bt_next_unactive)
        else
            goToNext()
    }

//    private fun clearFocus() {
//        et_name.clearFocus()
//        et_email.clearFocus()
//        et_birth.clearFocus()
//    }

    private fun getEditText() {
        name = et_name.text.toString()
        birth = et_birth.text.toString()
        email = et_email.text.toString()
    }

    private fun goToNext() {
        getEditText()
        if (btn > 0 && !name.equals("") && !birth.equals("") && !email.equals("") && cb_service_privacy.isChecked) {
            iv_next_2.setImageResource(R.drawable.bt_next_active)
            iv_next_2.onClick {
                startActivity<SignUp3>()
                finish()
            }
        }
    }

}
