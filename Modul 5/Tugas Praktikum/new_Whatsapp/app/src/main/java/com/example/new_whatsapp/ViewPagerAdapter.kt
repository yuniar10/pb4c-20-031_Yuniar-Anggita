package com.example.new_whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
    return 3
    }

    override fun createFragment(position: Int): Fragment {
        return  when (position) {
            0 -> {
                ChatFragment()
            }
            1 -> {
                StatusFragment()
            }
            2 -> {
                CallFragment()
            }
            else -> {
            Fragment()
            }
        }
    }
}
