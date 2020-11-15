package com.example.grocerylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_user_grocery_list.*

class GroceryList : AppCompatActivity(),Adapter.onItemClickInterface{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_grocery_list)
      var arrayofgrocery=arrayOf<String>("Vegetables","Fruits","Dals","Diary")
recyclerview_grocerylist.adapter=Adapter(arrayofgrocery,this)
        recyclerview_grocerylist.layoutManager=GridLayoutManager(this,2)
    }

    override fun displayList() {
        Toast.makeText(this,"Item Clicked",Toast.LENGTH_SHORT).show()
        var arrayofgrocery=arrayOf<String>("Carrot","Beans","Cabbage","Tamato","potato")
        cardView.visibility=View.VISIBLE
        recyclerview_list.adapter=AdapterItemList(arrayofgrocery)
        recyclerview_list.layoutManager=LinearLayoutManager(this)
    }
}