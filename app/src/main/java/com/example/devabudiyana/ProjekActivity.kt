package com.example.devabudiyana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjekActivity : AppCompatActivity() {

    lateinit var projekView: RecyclerView
    lateinit var projekAdapter: ProjekAdapter
    val list = ArrayList<ProjekData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projek)

        projekView = findViewById(R.id.rvProjek)
        projekView.layoutManager = LinearLayoutManager( this)

        list.add(ProjekData("Lks Web", "Projek latihan Lks Web",
            "https://github.com/deva120/profil-guru-deva-budiyana"))

        list.add(
            ProjekData("Kasir Depot", "Aplikasi kasir depot air",
                "https://github.com/deva120/jobsheet192")
        )

        projekAdapter = ProjekAdapter(list)
        projekView.adapter = projekAdapter
    }
}