package com.cbellmont.ejemploandroidfragment1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cbellmont.ejemploandroidfragment1.databinding.ActivityMainBinding

interface MainActivityFragmentInterface {
    fun onClick()
}

class MainActivity : AppCompatActivity(), MainActivityFragmentInterface {

    lateinit var binding: ActivityMainBinding

    var nextFragment = FragmentRojo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            nextFragment.setListener(this)
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(binding.frameLayout.id, nextFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    override fun onClick() {
        Toast.makeText(this, "Click recibido en MainActivity", Toast.LENGTH_LONG).show()
    }
}