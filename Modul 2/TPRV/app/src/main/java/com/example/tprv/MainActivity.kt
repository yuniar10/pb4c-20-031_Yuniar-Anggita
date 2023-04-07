package com.example.tprv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<tprv>()
        data.add(tprv(R.drawable.baseline_person_24, "Holaw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Nisa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Sabyan", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Lola", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Noa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Huski", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "ruhiw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Ruhie", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Holaw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Nisa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Sabyan", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Lola", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Noa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Huski", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "ruhiw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Ruhie", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Holaw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Nisa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Sabyan", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Lola", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Noa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Huski", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "ruhiw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Ruhie", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Holaw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Nisa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Sabyan", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Lola", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Noa", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Huski", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "ruhiw", "haloo"))
        data.add(tprv(R.drawable.baseline_person_24, "Ruhie", "haloo"))

        adapter=MyAdapter(data)
    }
}