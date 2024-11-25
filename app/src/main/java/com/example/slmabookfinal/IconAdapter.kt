package com.example.slmabookfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.slmabookfinal.databinding.ItemIconBinding

class IconAdapter(
    private val icons: List<Int>, // List of icon resource IDs
    private val onIconSelected: (Int) -> Unit // Callback for icon selection
) : RecyclerView.Adapter<IconAdapter.IconViewHolder>() {

    private var selectedIcon: Int? = null

    inner class IconViewHolder(private val binding: ItemIconBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(iconResId: Int) {
            binding.iconImage.setImageResource(iconResId)
            // Highlight the selected icon
            binding.iconImage.alpha = if (selectedIcon == iconResId) 1.0f else 0.5f

            binding.root.setOnClickListener {
                selectedIcon = iconResId
                onIconSelected(iconResId)
                notifyDataSetChanged() // Update all items to reflect selection
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val binding = ItemIconBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IconViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        holder.bind(icons[position])
    }

    override fun getItemCount(): Int = icons.size
}
