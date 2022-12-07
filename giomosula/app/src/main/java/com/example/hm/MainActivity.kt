package com.example.hm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pag = findViewById<ViewPager2>(R.id.viewPager)
        var tabLay = findViewById<TabLayout>(R.id.tabLay)
        val adap = Adapter(supportFragmentManager, lifecycle)

        pag.adapter = adap

        TabLayoutMediator(tabLay, pag){tab, position->
            when(position){
                0->{
                    tab.text = "Home"
                }
                1->{
                    tab.text = "Profile"
                }
                2->{
                    tab.text = "Dashboard"
                }
            }
        }.attach()

    }
}