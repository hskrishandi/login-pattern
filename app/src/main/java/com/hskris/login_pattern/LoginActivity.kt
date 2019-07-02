package com.hskris.login_pattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hskris.login_pattern.auth.Auth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()
            login(username, password)
        }
    }

    fun login(username: String, password: String){
        if(Auth.login(username, password)){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Username or password is incorrect", Toast.LENGTH_SHORT).show()
        }
    }
}
