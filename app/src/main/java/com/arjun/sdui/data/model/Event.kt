package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Event(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("element")
    val element: String?,
    @SerializedName("type")
    val type: String?
)