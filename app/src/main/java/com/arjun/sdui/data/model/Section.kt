package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Section(
    @SerializedName("id")
    val id: String?,
    @SerializedName("section")
    val section: SectionX?
)