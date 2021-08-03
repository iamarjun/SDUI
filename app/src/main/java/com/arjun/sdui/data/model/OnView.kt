package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class OnView(
    @SerializedName("events")
    val events: List<Event>?
)