package com.cbellmont.ejemploandroidfragment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nextFragment : Fragment = FragmentRojo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frameLayout, nextFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
            nextFragment = if (nextFragment is FragmentRojo) FragmentAmarillo() else FragmentRojo()
        }
    }
}