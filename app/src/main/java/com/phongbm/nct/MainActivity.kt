package com.phongbm.nct

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.phongbm.nct.databinding.ActivityMainBinding

/**
 * Created by PhongBM on 05/08/2021
 */

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
    }

}