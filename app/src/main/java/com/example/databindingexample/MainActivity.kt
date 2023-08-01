package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var user1:Users = Users(100,"Ashraf Gardizy","12345")
        binding.user = user1
//        binding.apply {
//            userID.text = user.id.toString()
//            userName.text = user.name
//            userPass.text = user.pass
//        }

    }
}