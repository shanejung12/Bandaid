package com.example.bandaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import kotlinx.android.synthetic.main.start_screen.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

    }
    fun buttonPress(view: View)
    {
        startActivity(Intent(this, CreateAccount::class.java))
    }

}
