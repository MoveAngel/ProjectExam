package com.example.iyhproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder (inflater: LayoutInflater, parent : ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_item, parent, false)) {
    private lateinit var imageView: ImageView
    private lateinit var tv_Nama_Produk : TextView
    private lateinit var tv_rating_food : TextView
    private lateinit var tv_Harga : TextView

    init {
        imageView = itemView.findViewById(R.id.iv_list)
        tv_Nama_Produk = itemView.findViewById(R.id.tv_Nama_Produk)
        tv_rating_food = itemView.findViewById(R.id.tv_rating_food)
        tv_Harga = itemView.findViewById(R.id.tv_Harga)
    }

    fun bind(data : Food) {
        imageView.setImageResource(data.imageView)
        tv_Nama_Produk.text = data.tv_Nama_Produk
        tv_rating_food.text = "(${data.tv_rating_food})"
        tv_Harga.text = "Rp ${data.tv_Harga}"
    }
}