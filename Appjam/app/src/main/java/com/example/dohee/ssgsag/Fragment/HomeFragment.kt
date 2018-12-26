package com.example.dohee.ssgsag.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dohee.ssgsag.R

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val homeFragmentView : View = inflater!!.inflate(R.layout.fragment_home, container, false)
        return homeFragmentView
    }

    companion object {
        private var instance : HomeFragment? = null
        @Synchronized
        fun getInstance() : HomeFragment {
            if (instance == null){
                instance = HomeFragment()
            }
            return instance!!
        }
    }
}