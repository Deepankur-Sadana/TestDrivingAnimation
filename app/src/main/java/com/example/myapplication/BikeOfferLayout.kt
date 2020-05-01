package com.example.myapplication

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout


class BikeOfferLayout : FrameLayout {
    constructor(context: Context) : this(context, null) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView()
    }

    private fun initView() {
        View.inflate(context, R.layout.animator, this)
    }

    fun startAnimation() {
        val animator = ValueAnimator()
        animator.apply {
            duration = 5000
            setFloatValues(0F, 1F)
            addUpdateListener { valueAnimator ->
                val fractions = valueAnimator.animatedFraction

            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator?) {
                    super.onAnimationEnd(animation)

                }
            }
            )
        }
        animator.start()
    }
}