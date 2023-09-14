package com.example.devabudiyana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkillActivity : AppCompatActivity() {

    lateinit var skillView: RecyclerView
    lateinit var skillAdapter: SkillAdapter
    val list = ArrayList<SkillData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        skillView = findViewById(R.id.rvSkill)
        skillView.layoutManager = LinearLayoutManager( this)

        list.add(SkillData("kotlin","Pemrograman Android"))
        list.add(SkillData("PHP","Pemrograman Web"))

        skillAdapter = SkillAdapter(list)
        skillView.adapter = skillAdapter
    }
}