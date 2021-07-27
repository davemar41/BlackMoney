package com.example.blackmoney

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blackmoney.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle:Bundle?=intent.extras
        val resultado:String?=bundle?.getString("cantidad")
        binding.editTextNumberDecimal.setText(resultado)
       



        binding.entrar.setOnClickListener {
            val intent= Intent(this,Calculadora::class.java)
            startActivity(intent)




        }




    }


}