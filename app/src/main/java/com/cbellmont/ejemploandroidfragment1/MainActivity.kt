package com.cbellmont.ejemploandroidfragment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

interface MainActivityFragmentInterface {
    fun onClick()
}

class MainActivity : AppCompatActivity(), MainActivityFragmentInterface {
    var nextFragment = FragmentRojo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            nextFragment.setListener(this)
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frameLayout, nextFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    override fun onClick() {
        Toast.makeText(this, "Click recibido en MainActivity", Toast.LENGTH_LONG).show()
    }
}