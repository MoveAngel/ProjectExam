package com.example.iyhproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler_view : RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recycler_view.layoutManager = GridLayoutManager(this, 2)
        recycler_view.adapter = adapter
    }

    private fun init() {
        recycler_view = findViewById(R.id.rv_itemlist)

        var data = ArrayList<Food>()
            data.add(Food(R.drawable.ayambakar, "Ayam Bakar", "25", "15.000"))
            data.add(Food(R.drawable.sateayam, "Sate Ayam", "40", "15.000"))
            data.add(Food(R.drawable.baksosapi, "Bakso Sapi", "45", "10.000"))
            data.add(Food(R.drawable.ikanbakar, "Ikan Bakar", "50", "40.000"))
            data.add(Food(R.drawable.kentangmustofa, "Kentang Mustofa", "10", "12.000"))
            data.add(Food(R.drawable.nasigoreng, "Nasi Goreng", "24", "14.000"))
            data.add(Food(R.drawable.rawon, "Rawon", "34", "15.000"))
            data.add(Food(R.drawable.gudeg, "Gudeg", "70", "20.000"))
            data.add(Food(R.drawable.airmineral, "Air Mineral",  "150", "3.000"))
            data.add(Food(R.drawable.esteh, "Es Teh", "60", "4.000"))
            data.add(Food(R.drawable.esjeruk, "Es Jeruk", "48", "5.000"))
            data.add(Food(R.drawable.escincau, "Es Cincau", "28", "6.000"))
            data.add(Food(R.drawable.anekajus, "Aneka Jus", "42", "7.000"))

        adapter = MyAdapter(data)
    }
}