package com.example.vehicleproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.vehicleproject.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeFragment : Fragment() {

    lateinit var fabAddVehicle : FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.home_Screen_title)

        fabAddVehicle = view.findViewById(R.id.fabAddVehicle)
        fabAddVehicle.setOnClickListener {

            val fragment = VehicleRegistrationInputFragment()
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(android.R.id.content, fragment).addToBackStack(null).commit()
        }

    }

}