package com.mobile.moviecatalogue

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("release_date")
    val release : String?,

    @SerializedName("popularity")
    val popularity : String?,

    @SerializedName("overview")
    val overview : String?



    ) : Parcelable {
    constructor() : this("", "", "", "","","")
}

