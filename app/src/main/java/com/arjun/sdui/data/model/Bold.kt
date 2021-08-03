package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Bold(
    @SerializedName("display_text")
    val displayText: String?,
    @SerializedName("element")
    val element: String?,
    @SerializedName("identifier")
    val identifier: String?
)