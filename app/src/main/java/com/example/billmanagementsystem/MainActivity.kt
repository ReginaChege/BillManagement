package com.example.billmanagementsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.billmanagementsystem.databinding.ActivityMainBinding
import com.example.billmanagementsystem.databinding.ManagementListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayManagement()
    }
    fun displayManagement(){
        val manage1= ManagementData("Regina","070987450","regina.com","https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        val manage3=ManagementData("Eunice","078765340","eunice.com","https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZXJzb24lMjBwcm9maWxlJTIwcGljdHVyZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val manage4=ManagementData("Ann","079874750","ann.com","https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1370&q=80 ")
        val manage5=ManagementData("Grace","079235380","grace.com","https://images.unsplash.com/photo-1525357816819-392d2380d821?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVyc29uJTIwcHJvZmlsZSUyMHBpY3R1cmV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")

        val managementName= mutableListOf<ManagementData>(manage1,manage3,manage5,manage5)
//       val contactName=listOf(contact1,contact3,contact4,contact5)
        val manageAdapter=ManagementRvAdapter(managementName)
        binding.rvBill.layoutManager= LinearLayoutManager(this)
        binding.rvBill.adapter=manageAdapter
    }
}