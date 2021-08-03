package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class OnPress(
    @SerializedName("actions")
    val actions: List<Action>?,
    @SerializedName("events")
    val events: List<Event>?
)