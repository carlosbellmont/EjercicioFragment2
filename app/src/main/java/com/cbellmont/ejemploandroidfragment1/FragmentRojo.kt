package com.cbellmont.ejemploandroidfragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_rojo.*

class FragmentRojo : Fragment() {

    private var mainActivityFragmentInterface: MainActivityFragmentInterface? = null

    fun setListener(mainActivityFragmentInterface: MainActivityFragmentInterface) {
        this.mainActivityFragmentInterface = mainActivityFragmentInterface
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_rojo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutRojo.setOnClickListener { mainActivityFragmentInterface?.onClick() }
    }

}