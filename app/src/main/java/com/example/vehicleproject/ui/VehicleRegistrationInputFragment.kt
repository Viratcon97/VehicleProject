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

class VehicleRegistrationInputFragment : Fragment() {

    lateinit var fabNext : FloatingActionButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vehicle_registration_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().title = getString(R.string.new_vehicle_profile_title)

        fabNext = view.findViewById(R.id.fabNext)
        fabNext.setOnClickListener {

            val fragment = VehicleTypeFragment()
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(android.R.id.content, fragment).addToBackStack(null).commit()
        }
    }
}