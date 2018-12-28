package com.example.dohee.ssgsag.Fragment

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.applandeo.materialcalendarview.CalendarView
import com.applandeo.materialcalendarview.EventDay
import com.example.dohee.ssgsag.Adapter.TodoListRecyclerViewAdapter
import com.example.dohee.ssgsag.Decorator.DotDecorator
import com.example.dohee.ssgsag.Decorator.OneDayDecorator
import com.example.dohee.ssgsag.Decorator.SundayDecorator
import com.example.dohee.ssgsag.R
import com.example.dohee.ssgsag.ScheduleRegisterActivity
import com.example.dohee.ssgsag.data.TodoListData
import kotlinx.android.synthetic.main.fragment_calendar.*
import kotlinx.android.synthetic.main.fragment_calendar.view.*
import org.jetbrains.anko.support.v4.startActivity
import java.util.*
import kotlin.collections.ArrayList


class CalendarFragment : Fragment(){

    lateinit var todoListRecyclerViewAdapter: TodoListRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val calendarFragment: View = inflater!!.inflate(R.layout.fragment_calendar, container, false)

        var events:ArrayList<EventDay> = ArrayList()
        val calendar1 : Calendar = Calendar.getInstance()
        calendar1.add(Calendar.DAY_OF_MONTH,1);
        events.add(EventDay(calendar1,R.mipmap.ic_launcher_app))

       // var calendarImage:CalendarView = calendarFragment.
        var sundayDecorator = SundayDecorator()
        var onedayDecorator = OneDayDecorator()
        calendarFragment.frag_calendar_view.addDecorators(sundayDecorator, onedayDecorator)



        setOnClickListener(calendarFragment)
        return calendarFragment

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView(){
        //임시 데이터
        var dataList: ArrayList<TodoListData> = ArrayList()
        dataList.add(TodoListData("할 일1","D-3"))
        dataList.add(TodoListData("할 일2", "D-2"))

        todoListRecyclerViewAdapter = TodoListRecyclerViewAdapter(activity!!,dataList)
        rv_frag_calendar_todo_list.adapter = todoListRecyclerViewAdapter
        rv_frag_calendar_todo_list.layoutManager = LinearLayoutManager(activity)

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

        calendarFragment.frag_calendar_iv_register.setOnClickListener {

            startActivity<ScheduleRegisterActivity>()
        }
    }


}