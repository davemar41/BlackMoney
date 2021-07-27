package com.example.blackmoney

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blackmoney.databinding.ActivityCalculadoraBinding
import com.example.blackmoney.databinding.ActivityMainBinding

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val diez=10.0
        val doce=12.0
        val trece=13.0
        val domicilio=16.0
        val quince=15.0
        var cero=0.0
        var resultado=0.0

        binding.editTextNumberDecimal2.setText(resultado.toString())
        val valorguard=getSharedPreferences("cantidad",Context.MODE_PRIVATE)
        binding.editTextNumberDecimal2.setText(valorguard.getString("valorguardado",""))




            resultado=valorguard.getString("valorguardado","").toString().toDouble()






        var cantidad=0.0
        binding.diez.setOnClickListener {
            cero=binding.editTextNumberDecimal2.text.toString().toDouble()

            resultado=cero+diez
                    binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)



        }
        binding.doce.setOnClickListener {
            cero=binding.editTextNumberDecimal2.text.toString().toDouble()
            resultado=cero+doce

            binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)

        }
        binding.domicilio.setOnClickListener {
            cero=binding.editTextNumberDecimal2.text.toString().toDouble()
            resultado=cero+domicilio
            binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)
        }
        binding.quince.setOnClickListener {
            cero=binding.editTextNumberDecimal2.text.toString().toDouble()
            resultado=cero+quince
            binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)

        }
        binding.trece.setOnClickListener {
            cero=binding.editTextNumberDecimal2.text.toString().toDouble()
            resultado=cero+trece
            binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)


        }
        binding.borrar.setOnClickListener {
            resultado=0.0
            binding.editTextNumberDecimal2.setText(resultado.toString())
            guardocosas(resultado)

        }
        binding.grabar.setOnClickListener {
            resultado=binding.editTextNumberDecimal2.text.toString().toDouble()
            guardocosas(resultado)

        }
        binding.volver.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            var bundle=Bundle()
            bundle.putString("cantidad",binding.editTextNumberDecimal2.text.toString())
            intent.putExtras(bundle)

            startActivity(intent)
        }


    }
    fun guardocosas(resultado:Double){
        var valorguardado=getSharedPreferences("cantidad",Context.MODE_PRIVATE)
        with(valorguardado.edit()){
            putString("valorguardado",resultado.toString()).apply()
        }


    }


}