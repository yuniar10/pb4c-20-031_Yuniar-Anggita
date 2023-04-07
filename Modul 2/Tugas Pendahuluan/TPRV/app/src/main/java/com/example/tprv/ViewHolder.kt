package com.example.tprv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.rv_item, parent, false)) {
private var imgView: ImageView? = null
    private var txt_view: TextView? = null
    private var subtitle: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txt_view=itemView.findViewById(R.id.txt_title)
        subtitle=itemView.findViewById(R.id.txt_sub_title)

    }
fun bind(data: tprv){
    imgView?.setImageResource(data.imgView)
    txt_view?.text=data.txtTitle
    subtitle?.text=data.txtsubtitle
}
}