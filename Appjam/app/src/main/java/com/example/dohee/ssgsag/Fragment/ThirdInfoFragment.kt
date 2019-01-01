package com.example.dohee.ssgsag.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dohee.ssgsag.R

class ThirdInfoFragment: Fragment(){

    private var thirdInfoFragment: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        thirdInfoFragment = inflater!!.inflate(R.layout.fragment_3rd_info, container, false)


        return thirdInfoFragment
    }


}