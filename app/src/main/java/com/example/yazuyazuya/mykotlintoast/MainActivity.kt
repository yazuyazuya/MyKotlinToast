package com.example.yazuyazuya.mykotlintoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.Gravity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        val toastMessage = "これがトーストだよ"

        button.setOnClickListener{
            toastMake(toastMessage, 0, -200)
        }

    }

    private fun toastMake(message: String, x: Int, y: Int) {
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_LONG)
        // 位置調整
        toast.setGravity(Gravity.CENTER, x, y)
        toast.show()
    }

}
