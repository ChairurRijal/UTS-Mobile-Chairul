package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NovelAdapter (private val context: Context, private val novel: List<NovelClass>, val listener: (NovelClass) -> Unit)
    : RecyclerView.Adapter<NovelAdapter.NovelViewHolder>(){
    class NovelViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val sepatuimg = view.findViewById<ImageView>(R.id.image)
        val sepatuname = view.findViewById<TextView>(R.id.tv_name)
        val sepatudate = view.findViewById<TextView>(R.id.tv_date)
        val sepatuauthor = view.findViewById<TextView>(R.id.tv_author)
        val sepaturate = view.findViewById<TextView>(R.id.tv_rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(novel: NovelClass, listener: (NovelClass) -> Unit){
            sepatuimg.setImageResource(novel.sepatuimg)
            sepatuname.text = novel.sepatuname
            sepatudate.text = novel.sepatudate
            sepatuauthor.text = novel.sepatuauthor
            sepaturate.text = novel.sepaturate
            ratingbar.rating = novel.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(novel))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelViewHolder {
        return NovelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NovelViewHolder, position: Int) {
        holder.bindView(novel[position], listener)
    }

    override fun getItemCount(): Int = novel.size

}