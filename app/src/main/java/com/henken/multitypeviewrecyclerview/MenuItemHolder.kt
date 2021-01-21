package com.henken.multitypeviewrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.henken.multitypeviewrecyclerview.data.MenuItem

class MenuItemHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val itemName = itemView.findViewById(R.id.itemName) as TextView
    private val itemPrice = itemView.findViewById(R.id.itemPrice) as TextView
    private val itemCount = itemView.findViewById(R.id.itemCount) as TextView

    fun bindContent(menuItem: MenuItem){
        itemCount.text = menuItem.count.toString()
        itemName.text = menuItem.name
        itemPrice.text = "Rp. ${menuItem.price}"
    }

}