package com.example.grocerylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_individual_list_items.view.*

class AdapterItemList (var groceryList:Array<String>):RecyclerView.Adapter<AdapterItemList.Adapterlist>(){
    class Adapterlist(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        var itemName=itemView.textview_itemName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapterlist {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_view_individual_list_items,
            parent, false)
        return Adapterlist(view)
    }

    override fun onBindViewHolder(holder: Adapterlist, position: Int) {
        holder.itemName.text=groceryList[position]
    }

    override fun getItemCount(): Int {
     return groceryList.size
    }
}