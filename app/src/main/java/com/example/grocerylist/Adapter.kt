package com.example.grocerylist

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_available_grocery_list.view.*

class Adapter(private val grocery:Array<String>,val clickListen:onItemClickInterface)
    :RecyclerView.Adapter<Adapter.ItemViewAdapter>()
{
    class ItemViewAdapter(item:View):RecyclerView.ViewHolder(item){
        val item1: TextView =item.tvlist

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewAdapter {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_view_available_grocery_list,
                parent, false)
        return ItemViewAdapter(view)
    }

    override fun onBindViewHolder(holder: ItemViewAdapter, position: Int) {
         holder.item1.text=grocery[position]
        holder.item1.setOnClickListener{
            clickListen.displayList()
        }


    }

    override fun getItemCount(): Int {
        return grocery.size
    }

    interface onItemClickInterface
    {
        fun displayList()
    }
}