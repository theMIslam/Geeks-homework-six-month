package com.example.homework6_3.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework6_3.databinding.ItemHintBinding

class HintAdapter(val onItemClick: (hint: String) -> Unit) : Adapter<HintAdapter.HintViewHolder>() {

    private val data = arrayListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun addData(newData: ArrayList<String>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HintViewHolder {
        return HintViewHolder(
            ItemHintBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HintViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class HintViewHolder(private val binding: ItemHintBinding) : ViewHolder(binding.root) {
        fun bind(hint: String) {
            binding.tvHint.text = hint
            itemView.setOnClickListener {
                onItemClick(hint)
            }
        }
    }
}