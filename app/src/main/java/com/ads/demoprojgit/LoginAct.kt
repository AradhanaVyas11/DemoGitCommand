package com.ads.demoprojgit

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginAct : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvRegister.setOnClickListener(this)
        tvForgotPassword.setOnClickListener(this)
        btnSignIn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val itemId = view?.id
        when (itemId) {
            R.id.tvRegister -> {
                val intent = Intent(this, RegistrationAct::class.java)
                startActivity(intent)
            }

            R.id.tvForgotPassword -> {
                Log.e("TAG", "Forgot Password")
            }

            R.id.btnSignIn -> {
                Log.e("TAG", "Sign In")
            }
        }
    }
}