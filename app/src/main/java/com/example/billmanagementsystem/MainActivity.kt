package com.example.billmanagementsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.billmanagementsystem.databinding.ActivityMainBinding
import com.example.billmanagementsystem.databinding.ManagementListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}