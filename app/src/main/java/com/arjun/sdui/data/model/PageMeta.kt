package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class PageMeta(
    @SerializedName("page_number")
    val pageNumber: Int?
)