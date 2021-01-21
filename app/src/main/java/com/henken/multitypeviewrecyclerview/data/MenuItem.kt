package com.henken.multitypeviewrecyclerview.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MenuItem(
    val name : String,
    val type : String,
    val price : Int,
    val count : Int,
    val itemPreview : Int
): Parcelable
