package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Layout(
    @SerializedName("body")
    val body: Body?,
    @SerializedName("footer")
    val footer: Footer?,
    @SerializedName("nav")
    val nav: Nav?
)