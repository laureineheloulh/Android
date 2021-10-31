package com.example.crous_project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class CrousAdapter (private val crousList: ArrayList<Crous>) :
    RecyclerView.Adapter<CrousViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrousViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.row_crous, parent, false)
        return CrousViewHolder(row)
    }
    @Override
    public fun createFragment( position: Int): Fragment {
        when(position){
            0-> CrousListFragment()
            1->CrousMapFragment()
            2->CrousInfoFragment()
        }
        return CrousListFragment()
    }

    override fun onBindViewHolder(holder: CrousViewHolder, position: Int) {
        val (name, type, zone) = crousList[position]

        holder.txvName.text = name
        holder.txvType.text = type
        holder.txvZone.text = zone
    }

    override fun getItemCount(): Int {
        return crousList.size
    }

    /*
    override fun getItemId(position: Int): String {
        return crousList[position].id
    }
    */
    fun refreshData(newCrous:ArrayList<Crous>){
        crousList.clear()
        crousList.addAll(newCrous)
    }


}