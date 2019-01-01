package com.example.dohee.ssgsag.SignUp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import com.example.dohee.ssgsag.R
import kotlinx.android.synthetic.main.activity_signup3.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class SignUp3 : AppCompatActivity() {

    private var school: String = ""
    private var major: String = ""
    private var grade: String = ""
    private var sid: String = ""

    override fun onBackPressed() {
        startActivity<SignUp2>()
        finish()
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup3)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        iv_back_3.onClick {
            startActivity<SignUp2>()
//            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.exit_out_left)
            finish()
        }

        et_school.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        et_major.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        et_grade.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                changeInput()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        et_sid.addTextChangedListener(object : TextWatcher {
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
        if (school.equals("") || major.equals("") || grade.equals("")||sid.equals(""))
            iv_next_3.setImageResource(R.drawable.bt_next_unactive)
        else
            goToNext()
    }

    private fun getEditText() {
        school = et_school.text.toString()
        major = et_major.text.toString()
        grade = et_grade.text.toString()
        sid = et_sid.text.toString()
    }

    private fun goToNext() {
        getEditText()
        if (!school.equals("") && !major.equals("") && !grade.equals("") && !sid.equals("")) {
            iv_next_3.setImageResource(R.drawable.bt_next_active)
            iv_next_3.onClick {
                startActivity<SignUp4>()
                finish()
            }
        }
    }
}
