package com.phongbm.nct

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

/**
 * Created by PhongBM on 05/08/2021
 */

abstract class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(javaClass.simpleName, "onCreate()...")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(javaClass.simpleName, "onViewCreated()...")
    }

    override fun onStart() {
        super.onStart()
        Log.d(javaClass.simpleName, "onStart()...")
    }

    override fun onResume() {
        super.onResume()
        Log.d(javaClass.simpleName, "onResume()...")
    }

    override fun onPause() {
        Log.d(javaClass.simpleName, "onPause()...")
        super.onPause()
    }

    override fun onStop() {
        Log.d(javaClass.simpleName, "onStop()...")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(javaClass.simpleName, "onDestroyView()...")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(javaClass.simpleName, "onDestroy()...")
        super.onDestroy()
    }

}