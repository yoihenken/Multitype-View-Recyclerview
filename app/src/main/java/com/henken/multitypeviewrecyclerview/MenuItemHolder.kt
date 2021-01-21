package com.henken.multitypeviewrecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.henken.multitypeviewrecyclerview.data.MenuItem
import com.henken.multitypeviewrecyclerview.databinding.ItemMenuBinding

class MenuItemHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private lateinit var bindingItem : ItemMenuBinding

    fun bindContent(menuItem: MenuItem) = with(bindingItem){
        itemCount.text = menuItem.count.toString()
        itemName.text = menuItem.name
        itemPrice.text = "Rp. ${menuItem.price}"
    }

}