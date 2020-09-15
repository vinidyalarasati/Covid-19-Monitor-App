package com.example.covid_19monitorapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covid_19monitorapp.Data.HotlineData
import com.example.covid_19monitorapp.R

class HotlineAdapter(private val hotlineList: MutableList<HotlineData>) : RecyclerView.Adapter<HotlineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotlineViewHolder {
        return HotlineViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_hotline, parent,false))
    }

    override fun onBindViewHolder(holder: HotlineViewHolder, position: Int) {
        holder.bind(hotlineList[position])
    }

    override fun getItemCount(): Int {
        return hotlineList.size
    }

    fun updateData(newList: List<HotlineData>){
        hotlineList.clear()
        hotlineList.addAll(newList)

        notifyDataSetChanged()
    }
}