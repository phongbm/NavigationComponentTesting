package com.phongbm.nct

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.phongbm.nct.databinding.FragmentFirstBinding

/**
 * Created by PhongBM on 05/08/2021
 */

class FirstFragment : BaseFragment() {
    companion object {
        private const val TAG = "FirstFragment"
    }

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView()...")

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.btnOpenSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.actSecondFragment)
        }
    }

}