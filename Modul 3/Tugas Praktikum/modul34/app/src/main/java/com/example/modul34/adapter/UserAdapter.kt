package com.example.modul34.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul34.R
import com.example.modul34.data.entity.User

class UserAdapter(var list: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private lateinit var dialog: Dialog

    fun setDialog(dialog: Dialog){
        this.dialog = dialog
    }

    interface Dialog {
        fun onClick(position: Int)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var fullname: TextView
        var email: TextView
        var telpon: TextView
        var alamat: TextView

        init {
            fullname = view.findViewById(R.id.full_name)
            email = view.findViewById(R.id.email)
            telpon = view.findViewById(R.id.telpon)
            alamat = view.findViewById(R.id.alamat)
            view.setOnClickListener {
                dialog.onClick(layoutPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullname.text = list[position].fullName
        holder.email.text = list[position].email
        holder.telpon.text = list[position].telpon
        holder.alamat.text = list[position].alamat
    }
}

