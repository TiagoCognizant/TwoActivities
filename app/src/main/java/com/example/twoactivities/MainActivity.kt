package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mMessageEditText: EditText

    companion object{
        const val EXTRA_MESSAGE = "com.example.twoActivities.extra.Message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editText_main)
    }

    fun launchSecondActivity(view: View) {
        Log.d("Log Send", "Button Clicked")
        val intent = Intent(this, SecondActivity::class.java) //Opens second Activity
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE,message)
        startActivity(intent)
    }

}