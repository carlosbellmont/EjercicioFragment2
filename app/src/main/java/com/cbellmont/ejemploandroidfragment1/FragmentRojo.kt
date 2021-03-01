package com.cbellmont.ejemploandroidfragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbellmont.ejemploandroidfragment1.databinding.FragmentRojoBinding
import kotlinx.android.synthetic.main.fragment_rojo.*

class FragmentRojo : Fragment() {

    private var mainActivityFragmentInterface: MainActivityFragmentInterface? = null

    private lateinit var binding : FragmentRojoBinding

    fun setListener(mainActivityFragmentInterface: MainActivityFragmentInterface) {
        this.mainActivityFragmentInterface = mainActivityFragmentInterface
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRojoBinding.inflate(layoutInflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layoutRojo.setOnClickListener { mainActivityFragmentInterface?.onClick() }
    }

}