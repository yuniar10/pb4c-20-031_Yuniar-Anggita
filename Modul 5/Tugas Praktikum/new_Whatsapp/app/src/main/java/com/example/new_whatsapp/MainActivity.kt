package com.example.new_whatsapp

import android.content.ComponentCallbacks
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout=findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2=findViewById<ViewPager2>(R.id.view_pager_2)

        val adapter=ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="Chat"
                }
                1->{
                    tab.text="Status"
                }
                2->{
                    tab.text="Panggilan"
                }
            }

        }.attach()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.kamera-> Toast.makeText(this, "Kamu menekan Kamera",Toast.LENGTH_SHORT).show()
           R.id.search-> Toast.makeText(this, "Kamu menekan Search",Toast.LENGTH_SHORT).show()
           R.id.more-> Toast.makeText(this, "Kamu menekan more",Toast.LENGTH_SHORT).show()
       }
        return true
    }
}