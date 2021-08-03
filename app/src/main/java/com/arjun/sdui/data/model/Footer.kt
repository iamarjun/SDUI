package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Footer(
    @SerializedName("section_details")
    val sectionDetails: List<Any>?,
    @SerializedName("type")
    val type: String?
)