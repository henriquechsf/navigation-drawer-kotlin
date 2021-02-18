package com.example.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById(R.id.rv_list)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updatedList()
    }

    private fun updatedList() {
        TODO("Not yet implemented")
    }

    private fun bindViews() {
        TODO("Not yet implemented")
    }
}