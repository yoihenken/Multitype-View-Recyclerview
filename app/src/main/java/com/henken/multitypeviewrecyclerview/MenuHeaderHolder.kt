package com.henken.multitypeviewrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.henken.multitypeviewrecyclerview.databinding.ItemHeaderBinding

class MenuHeaderHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView

    fun bindContent(text: String){
        itemHeader.text = text
    }
}