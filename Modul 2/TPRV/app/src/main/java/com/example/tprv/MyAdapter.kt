package com.example.tprv

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val data: ArrayList<tprv>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = data[position]
        holder.bind(data[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${data[position].txtTitle}", Toast.LENGTH_SHORT).show()
            Toast.makeText(holder.itemView.context, "${data[position].txtsubtitle}", Toast.LENGTH_SHORT).show()
        }
    }
}
