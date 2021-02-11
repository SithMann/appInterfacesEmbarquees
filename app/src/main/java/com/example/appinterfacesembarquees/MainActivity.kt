package com.example.appinterfacesembarquees

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivPiano = findViewById<ImageView>(R.id.ivPiano)
        val tvX = findViewById<TextView>(R.id.tvX)
        val tvY = findViewById<TextView>(R.id.tvY)


        ivPiano.setOnTouchListener {
                _, event ->
            val x = event.x
            val y = event.y
            var note = (x.toInt())*14/(ivPiano.width.toInt())
            tvY.text = note.toString()
            tvX.text = Notes(note).toString()
            true
        }


    }


}

