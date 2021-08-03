package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class SectionDetail(
    @SerializedName("section_id")
    val sectionId: String?
)