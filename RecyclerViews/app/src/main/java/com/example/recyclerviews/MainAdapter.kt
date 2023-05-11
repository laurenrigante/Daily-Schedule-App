package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.recyclerviews.databinding.RecyclerviewitemBinding

class MainAdapter(val taskList: List<Task>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding:RecyclerviewitemBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
          fun bindItem(task:Task){
            itemBinding.titleTV.text=task.title
              itemBinding.timeTV.text=task.timestamp

          }
        }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task= taskList[position]
        holder.bindItem(task)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}