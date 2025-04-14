package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class studentAdapter(val items: List<`student-model`>, val listener: ItemClickListener? = null): RecyclerView.Adapter<studentAdapter.studentHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): studentHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return studentHolder(itemView,listener)
    }

    override fun onBindViewHolder(holder: studentHolder, position: Int) {
        val item = items[position]
        holder.hoten.text="N A B"
        holder.mssv.text="1313"


    }

    override fun getItemCount() = items.size

    class studentHolder(itemView: View, val listener: ItemClickListener? = null): RecyclerView.ViewHolder(itemView) {
        var hoten = itemView.findViewById<TextView>(R.id.text_hoten)
        val mssv = itemView.findViewById<TextView>(R.id.text_mssv)

        init {
            itemView.setOnClickListener {
                listener?.onItemClicked(adapterPosition)
            }
        }
    }

    interface ItemClickListener {
        fun onItemClicked(position: Int)
    }
}