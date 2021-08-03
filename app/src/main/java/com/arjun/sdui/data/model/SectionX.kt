package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class SectionX(
    @SerializedName("content")
    val content: Content?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("interactions")
    val interactions: Interactions?,
    @SerializedName("modifiers")
    val modifiers: Modifiers?,
    @SerializedName("version")
    val version: Any?
)