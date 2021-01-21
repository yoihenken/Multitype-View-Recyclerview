package com.henken.multitypeviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.henken.multitypeviewrecyclerview.data.Menu
import com.henken.multitypeviewrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var menuData = listOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        menuData = Menu.menus

        Log.d("MainActivity", "onCreate: $menuData")

        binding.apply {
            rvItem.hasFixedSize()
            rvItem.layoutManager = LinearLayoutManager(this@MainActivity)
            rvItem.adapter = MenuAdapter(menuData)

        }


    }
}