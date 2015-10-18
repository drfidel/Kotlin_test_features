package cz.united121.kotlin.Kotlin.Test

import android.util.Log

/**
 * Dummy test of understanding with function
 * Created by Petr Lorenc[Lorenc55Petr@seznam.cz] on {10/18/2015}
 **/

class Dummy {
    var TAG = "Dummy"

    fun someFunciton(value: Int): Unit {
        Log.d(TAG, "someFunciton" + value)
    }
}

fun callingWith(): Unit {
    var dummy = Dummy()
    with(dummy, { someFunciton(20) })

    with(dummy) {
        someFunciton(30)
    }
}