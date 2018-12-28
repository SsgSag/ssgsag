package com.example.dohee.ssgsag.Decorator

import android.graphics.Color
import android.graphics.Typeface
import android.media.Image
import android.text.SpannedString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.spans.DotSpan
import org.w3c.dom.Text
import java.util.*

class DotDecorator(day: CalendarDay) : DayViewDecorator {

    private var date: CalendarDay? = day
    private var text_example : String = "안뇽"
    private val calendar : Calendar = Calendar.getInstance()

    override fun shouldDecorate(day: CalendarDay): Boolean {
        return date != null && day == date
    }

    override fun decorate(view: DayViewFacade) {
        calendar.add(Calendar.DAY_OF_MONTH,2)
        view.addSpan(calendar)
       // view.addSpan(DotSpan(5.0f))
    }


    /**
     * We're changing the internals, so make sure to call [MaterialCalendarView.invalidateDecorators]
     */
    fun setDate(date: Date) {
        this.date = CalendarDay.from(date)
    }
}