package com.example.makingscreens

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapterMain(private var context : Context ,private var arrayList: ArrayList<Articles>) : RecyclerView.Adapter<NewsAdapterMain.MyViewHolder>() {

    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_main_article_adapter , parent , false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val articleModel = arrayList[position]
        
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}