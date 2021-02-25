package com.example.zvexample.custom_views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.zvexample.R

class StatsViews @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private lateinit var rect: Rect


    private val coulumNameTextPaint: Paint = Paint().apply {
        textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.let { drawMyRect(it) }
    }

    private fun drawMyRect(canvas: Canvas) {
        rect= Rect(50, 50, 200, 200)
        canvas.drawRect(rect,coulumNameTextPaint)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val x = event?.xPrecision
        val y = event?.yPrecision

        return super.onTouchEvent(event)
    }

    override fun setOnClickListener(l: OnClickListener?) {
        super.setOnClickListener(l)
    }
}