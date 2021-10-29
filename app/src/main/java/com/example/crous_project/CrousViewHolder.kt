package com.example.crous_project

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CrousViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {

    var txvName = rootView.findViewById<TextView>(R.id.r_crous_txv_name)
    var txvType = rootView.findViewById<TextView>(R.id.r_crous_txv_type)
    var txvZone = rootView.findViewById<TextView>(R.id.r_crous_txv_zone)

}