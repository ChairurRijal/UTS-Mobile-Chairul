package com.example.uts

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val novel = intent.getParcelableExtra<NovelClass>(MainActivity.INTENT_PARCELABLE)

        val sepatuimg = findViewById<ImageView>(R.id.image)
        val sepatuname = findViewById<TextView>(R.id.tv_name)
        val sepatudate = findViewById<TextView>(R.id.tv_date)
        val sepatuauthor = findViewById<TextView>(R.id.tv_author)
        val sepaturate = findViewById<TextView>(R.id.tv_rating)
        val ratingbar = findViewById<RatingBar>(R.id.ratingbar)
        val sepatudesc = findViewById<TextView>(R.id.tv_description)

        sepatuimg.setImageResource(novel?.sepatuimg!!)
        sepatuname.text = novel.sepatuname
        sepatudate.text = novel.sepatudate
        sepatuauthor.text = novel.sepatuauthor
        sepaturate.text = novel.sepaturate
        ratingbar.rating = novel.ratingbar.toFloat()
        sepatudesc.text = novel.sepatudesc
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}