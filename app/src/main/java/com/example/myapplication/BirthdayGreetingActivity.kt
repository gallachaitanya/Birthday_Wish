package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val OrgName="orgName"
    }
    private lateinit var binding: ActivityBirthdayGreetingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val name=intent.getStringExtra(OrgName)
        binding.birthdayGreeting.text="Happy Birthday \n $name!"
    }
}