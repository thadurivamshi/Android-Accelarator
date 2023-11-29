package com.example.scb4

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CntryAdapter(var cntry: Array<String>) : RecyclerView.Adapter<CntryHolder>() {
    var TAG = CntryAdapter::class.java.simpleName
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CntryHolder {
        Log.i(TAG,"Adding a  plank")
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return  CntryHolder(rowPlank)

    }

    override fun getItemCount(): Int {
        Log.i(TAG,"Plank count: " + cntry.size)
        return  cntry.size
    }

    override fun onBindViewHolder(holder: CntryHolder, position: Int) {
        Log.i(TAG,"Changes"+ cntry[position])
        holder.tvRowItem.setText(cntry[position])
    }
}

class CntryHolder(itemView: View) : ViewHolder(itemView) {
    var tvRowItem = itemView.findViewById<TextView>(R.id.tvRow)
}
