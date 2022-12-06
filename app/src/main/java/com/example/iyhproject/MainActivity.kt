package com.example.iyhproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var Username : EditText
    lateinit var Password : EditText
    lateinit var Login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        Username = findViewById(R.id.username)
        Password = findViewById(R.id.password)
        Login = findViewById(R.id.button)

        Login.setOnClickListener {
            val bundle = Bundle()

            bundle.putString("Username", Username.text.toString())
            bundle.putString("Password", Password.text.toString())

            val intent = Intent(this, Dashboard::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}