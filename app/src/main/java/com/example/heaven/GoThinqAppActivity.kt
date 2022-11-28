package com.example.heaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GoThinqAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_thinq_app)

        val intent = packageManager.getLaunchIntentForPackage("com.lgeha.nuts")

        findViewById<Button>(R.id.thinqBtn).setOnClickListener {

            startActivity(intent)

        }

    }
}