package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val dataList: ArrayList<Model>, val context: Context):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        val name = view.findViewById<TextView>(R.id.tvName)
        val img = view.findViewById<ImageView>(R.id.ivImage)
        val cardView = view.findViewById<CardView>(R.id.cardLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_file, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val module = dataList[position]

        holder.name.text = module.name
        holder.img.setImageResource(module.image)

        holder.cardView.setOnClickListener {

            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("name",module.name)
            intent.putExtra("image",module.image)
            intent.putExtra("description",module.description)
            context.startActivity(intent)
            Toast.makeText(context, module.name, Toast.LENGTH_SHORT).show()
        }
    }
}