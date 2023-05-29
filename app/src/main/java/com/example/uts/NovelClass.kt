package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NovelClass(
    val sepatuimg: Int,
    val sepatuname: String,
    val sepatudate: String,
    val sepatuauthor: String,
    val sepatudesc: String,
    val sepaturate: String,
    val ratingbar: Double
) : Parcelable