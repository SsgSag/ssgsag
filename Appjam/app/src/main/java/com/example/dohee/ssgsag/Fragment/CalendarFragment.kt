package com.example.dohee.ssgsag.Fragment

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.applandeo.materialcalendarview.EventDay
import com.example.dohee.ssgsag.Decorator.DotDecorator
import com.example.dohee.ssgsag.Decorator.EventDecorator
import com.example.dohee.ssgsag.Decorator.OneDayDecorator
import com.example.dohee.ssgsag.Decorator.SundayDecorator
import com.example.dohee.ssgsag.R
import com.prolificinteractive.materialcalendarview.CalendarDay
import kotlinx.android.synthetic.main.fragment_calendar.view.*


class CalendarFragment : Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val calendarFragment: View = inflater!!.inflate(R.layout.fragment_calendar, container, false)



        var sundayDecorator = SundayDecorator()
        var onedayDecorator = OneDayDecorator()
        calendarFragment.frag_calendar_view.addDecorators(sundayDecorator, onedayDecorator)



        setOnClickListener(calendarFragment)
        return calendarFragment
    }


/*
    companion object {
        private var instance: CalendarFragment? = null
        @Synchronized
        fun getInstance(): CalendarFragment {
            if (instance == null) {
                instance = CalendarFragment()
            }
            return instance!!
        }
    }

   */

    fun setOnClickListener(calendarFragment: View){


        calendarFragment.frag_calendar_view.setOnDateChangedListener { widget, date, selected ->

            var dotdecorator = DotDecorator(date)

            var year = date.year
            var month = date.month+1
            var day = date.day
            var today:String = year.toString()+"년"+month.toString()+"월"+day.toString()+"일"
            Toast.makeText(context, today, Toast.LENGTH_SHORT).show()
            Log.e("log test1", date.toString())
            widget.addDecorator(dotdecorator)



        }
    }


}