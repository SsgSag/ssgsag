package com.example.dohee.ssgsag.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.dohee.ssgsag.LoginActivity
import com.example.dohee.ssgsag.R
import org.jetbrains.anko.find
import org.jetbrains.anko.support.v4.startActivity

class FifthInfoFragment: Fragment(){
    private var fifthInfoFragment: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fifthInfoFragment = inflater!!.inflate(R.layout.fragment_5th_info, container, false)

        setOnBtnClickListener()

        return fifthInfoFragment
    }

    private fun setOnBtnClickListener(){
        val fifth_skip: RelativeLayout = fifthInfoFragment!!.find(R.id.btn_fifth_skip)
        fifth_skip.setOnClickListener {
            startActivity<LoginActivity>()
            activity!!.finish()
        }
    }

}