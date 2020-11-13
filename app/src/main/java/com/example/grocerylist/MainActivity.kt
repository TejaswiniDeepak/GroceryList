package com.example.grocerylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab_btn.setOnClickListener()
                {
                startActivity(Intent(this,GroceryList::class.java))
                }

    }
    override fun onResume()
    {
        super.onResume()
        loadList()

    }

    private fun loadList()
    {
        Toast.makeText(this,"List Loaded",Toast.LENGTH_SHORT).show()
    }
}