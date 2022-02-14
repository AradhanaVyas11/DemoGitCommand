package com.ads.demoprojgit

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationAct : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        tvBackToLogin.setOnClickListener(this)
        btnSignUp.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val itemId = view?.id
        when (itemId) {
            R.id.tvBackToLogin -> {
                onBackPressed()
            }

            R.id.btnSignUp -> {
                onBackPressed()
            }
        }
    }
}