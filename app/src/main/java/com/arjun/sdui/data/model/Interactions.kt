package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Interactions(
    @SerializedName("on_press")
    val onPress: OnPress?,
    @SerializedName("on_view")
    val onView: OnView?
)