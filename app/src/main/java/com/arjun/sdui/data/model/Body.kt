package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Body(
    @SerializedName("section_details")
    val sectionDetails: List<SectionDetail>?,
    @SerializedName("type")
    val type: String?
)