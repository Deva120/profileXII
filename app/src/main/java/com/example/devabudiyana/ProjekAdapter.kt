package com.example.devabudiyana

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjekAdapter(private val list:ArrayList<ProjekData>):
    RecyclerView.Adapter<ProjekAdapter.ProjekViewHolder>(){

    class ProjekViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val judul = itemView.findViewById<TextView>(R.id.judulProjek)
        private val desc = itemView.findViewById<TextView>(R.id.descProjek)
        private val panah = itemView.findViewById<ImageView>(R.id.linkProjek)

        fun bind(get:ProjekData){
            judul.text = get.judul
            desc.text = get.judul

            panah.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjekViewHolder {
        return ProjekViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.list_profile, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ProjekViewHolder, position: Int) {
        holder.bind(list[position])
    }
}