package cz.united121.kotlin.Kotlin


import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import cz.united121.kotlin.Java.MainActivity
import cz.united121.kotlin.Kotlin.Test.callingWith
import cz.united121.kotlin.Kotlin.UI.*
import cz.united121.kotlin.R
import kotlinx.android.synthetic.kotlin_layout.*

/**
 * TODO add class description
 * Created by Petr Lorenc[Lorenc55Petr@seznam.cz] on {10/11/2015}
 **/
public class KotlinClass : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_layout)

        var counter  = 5
        val counter2 : Int
        counter2 = counter

        hi_kotlin_button.setOnClickListener{
            hi_kotlin.setText("Ahoj" + counter2 + " + " + counter++ )
            var main = MainActivity()
            main.functionInJava(applicationContext)
        }

        up.setOnClickListener{
            foreground.animateUp()
        }
        down.setOnClickListener{
            foreground.animateDown()
        }
        left.setOnClickListener{
            foreground.animateLeft()
        }
        right.setOnClickListener{
            foreground.animateRight()
            callingWith()
        }
        scale.setOnClickListener {
            foreground.scaleOut()
        }

    }

    fun returnStringWithNoSpace(originalString: String, context : Context) {
        Toast.makeText(context.getApplicationContext(), originalString.NoSpace() , Toast.LENGTH_SHORT).show()
    }

}

fun returnStringWithNoSpace(originalString: String, context : Context) {
    Toast.makeText(context.getApplicationContext(), originalString.NoSpace() , Toast.LENGTH_SHORT).show()
}

fun String.NoSpace() : String{
    5.Add(5)
    return this.replace(" ","")
}

fun Int.Add(a : Int) : Int{
    return this + a;
}