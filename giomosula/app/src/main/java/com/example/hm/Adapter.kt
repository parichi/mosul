package com.example.hm

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                first_fragment()
            }
            1->{
                second_fragment()
            }
            2->{
                third_fragment()
            }
            else->{
                Fragment()
            }
        }
    }
}