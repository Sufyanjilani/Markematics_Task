package com.example.retrofit_yt

import UserItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(var con : Context , var list : List<UserItem>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(v : View) : RecyclerView.ViewHolder(v)
    {

        var tvfirst = v.findViewById<TextView>(R.id.tv_First)
        var tvsecond = v.findViewById<TextView>(R.id.tv_Second)
        var tvemail = v.findViewById<TextView>(R.id.tv_Email)
        var tvrollid = v.findViewById<TextView>(R.id.tv_Rollid)
        var tvpassw = v.findViewById<TextView>(R.id.tv_Password)
        var tvisactive = v.findViewById<TextView>(R.id.tv_Isactive)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(con).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
var model=list.get(position)
   holder.tvfirst.text=model.firstName
        holder.tvsecond.text=model.lastName
        holder.tvemail.text=model.emailId
        holder.tvpassw.text=model.password
        holder.tvisactive.text=model.isActive.toString()
        holder.tvrollid.text=model.roleid.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

}