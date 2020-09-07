package com.example.covid_19monitorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lookup.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val Extra="Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lookUpArrIcon.setOnClickListener(){
            lookUpActivity()
        }
        hotlineArrIcon.setOnClickListener(){
            lookUpActivity()
        }
    }
    private fun lookUpActivity(){
        val intent =Intent(this, LookupActivity::class.java).apply{
            putExtra(Extra,"Halo")
        }
        startActivity(intent)
    }
}