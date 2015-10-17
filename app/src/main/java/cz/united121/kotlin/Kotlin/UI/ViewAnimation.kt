package cz.united121.kotlin.Kotlin.UI

import android.R
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.Interpolator

/**
 * Animation of view
 * Created by Petr Lorenc[Lorenc55Petr@seznam.cz] on {10/17/2015}
 **/

fun View.animateDown() = animateTranslationY(this.top + 100, DecelerateInterpolator(3f))
fun View.animateUp() = animateTranslationY(this.top - 100, DecelerateInterpolator(3f))
fun View.animateRight() = animateTranslationX(this.left + 100, DecelerateInterpolator(3f))
fun View.animateLeft() = animateTranslationX(this.left - 100, DecelerateInterpolator(3f))

fun View.animateTranslationY(translationY: Int, interpolator: Interpolator) {
    with(ObjectAnimator.ofFloat(this, "translationY", translationY.toFloat()))
    {
        setDuration(context.resources.getInteger(R.integer.config_mediumAnimTime).toLong())
        setInterpolator(interpolator)
        start()
    }
}

fun View.animateTranslationX(translationX: Int, interpolator: Interpolator) {
    with(ObjectAnimator.ofFloat(this, "translationX", translationX.toFloat()))
    {
        setDuration(context.resources.getInteger(R.integer.config_mediumAnimTime).toLong())
        setInterpolator(interpolator)
        start()
    }
}