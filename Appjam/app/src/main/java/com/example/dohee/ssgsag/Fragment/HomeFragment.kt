package com.example.dohee.ssgsag.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dohee.ssgsag.R
import kotlinx.android.synthetic.main.fragment_calendar.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val homeFragmentView : View = inflater!!.inflate(R.layout.fragment_home, container, false)
       // setOnClickListener()
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
/*
    fun setOnClickListener(){
        //날짜 클릭 시 발생 이벤트
        frag_calendar_view.setOnDateChangedListener { widget, date, selected ->
            var year = date.year
            var month = date.month+1
            var day = date.day
            var today:String = year.toString()+"년"+month.toString()+"월"+day.toString()+"일"
            Toast.makeText(this.context, today, Toast.LENGTH_SHORT).show()
            Log.e("log test1", date.toString())
        }
    }
    */
}