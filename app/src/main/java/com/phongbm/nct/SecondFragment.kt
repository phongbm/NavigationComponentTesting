package com.phongbm.nct

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phongbm.nct.databinding.FragmentSecondBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 * Created by PhongBM on 05/08/2021
 */

class SecondFragment : BaseFragment() {
    companion object {
        private const val TAG = "SecondFragment"
    }

    private var binding: FragmentSecondBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView()...")

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prepareData()
    }

    private fun prepareData() {
        runBlocking {
            Log.d(TAG, "prepareData()... begin load data")
            delay(3000)
            Log.d(TAG, "prepareData()... end load data")
        }
    }

}