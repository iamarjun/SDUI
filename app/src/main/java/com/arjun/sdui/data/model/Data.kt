package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Data(
    @SerializedName("bottom_sheet_id")
    val bottomSheetId: String?,
    @SerializedName("url")
    val url: String?
)