package com.dbs.databinding.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dbs.databinding.demo.ui.main.MainFragment
import com.example.demo.R
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}