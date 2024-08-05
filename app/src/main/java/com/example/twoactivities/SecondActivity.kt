package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var mReply : EditText

    companion object{
        const val EXTRA_REPLY = "com.example.twoactivities.extra.REPLAY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView : TextView = findViewById(R.id.text_message)
        textView.setText(message)

    }

    fun replyMessage(view: View) {
        mReply = findViewById(R.id.editText_second)
        val reply = mReply.text.toString()
        val replyIntent = intent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }
}
