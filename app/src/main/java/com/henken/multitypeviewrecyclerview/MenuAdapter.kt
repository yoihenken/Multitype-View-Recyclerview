package com.henken.multitypeviewrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.henken.multitypeviewrecyclerview.data.MenuItem
import java.lang.IllegalArgumentException

class MenuAdapter(private val data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layout = getLayout(viewType)
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return getViewHolder(viewType, view)
    }

    private fun getViewHolder(viewType: Int, view: View): RecyclerView.ViewHolder {
        return when (viewType){
            ITEM_HEADER -> MenuHeaderHolder(view)
            ITEM_MENU -> MenuItemHolder(view)
            else -> throw IllegalArgumentException("Undefined viewtype")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val type = getItemViewType(position)){
            ITEM_HEADER -> (holder as MenuHeaderHolder).bindContent(data[position] as String)
            ITEM_MENU -> (holder as MenuItemHolder). bindContent(data[position] as MenuItem)
            else -> throw IllegalArgumentException("Undefined viewtype")
        }
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int {
        return when(data[position]) {
            is String -> ITEM_HEADER
            is MenuItem -> ITEM_MENU
            else -> throw IllegalArgumentException("Undefined viewtype")
        }
    }

    private fun getLayout(type : Int): Int {
        return when(type) {
            ITEM_HEADER -> R.layout.item_header
            ITEM_MENU -> R.layout.item_menu
            else -> throw IllegalArgumentException("Undefined viewtype")
        }
    }

    companion object{
        private val ITEM_HEADER = 0
        private val ITEM_MENU = 1
    }

}