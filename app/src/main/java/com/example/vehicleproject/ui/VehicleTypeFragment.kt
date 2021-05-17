package com.example.vehicleproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.vehicleproject.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VehicleTypeFragment : Fragment() {

    lateinit var fabNextVehicleMake : FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vehicle_type, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.vehicle_type)

        fabNextVehicleMake = view.findViewById(R.id.fabNextVehicleMake)
        fabNextVehicleMake.setOnClickListener {

            val fragment = VehicleMakeFragment()
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(android.R.id.content, fragment).addToBackStack(null).commit()
        }
    }
}