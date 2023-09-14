package com.example.devabudiyana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {
    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager( this)

        list.add(SekolahData("SDN Purwosari 02","JL.Setro Kidul, Purwosari, Kec. Sayung, Kabupaten Demak"))
        list.add(SekolahData("SMPN 1 Sayung","Jl.Sayung No.33, Setro Kidul, Purwosari, Kec. Sayung, Kabupaten Demak"))
        list.add(SekolahData("SMKN 1 Sayung","Jl.Raya Semarang Demak Km 14 Onggorawe Sayung Demak"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}