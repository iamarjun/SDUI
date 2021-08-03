package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Content(
    @SerializedName("body_line_1")
    val bodyLine1: String?,
    @SerializedName("body_line_1_icon")
    val bodyLine1Icon: String?,
    @SerializedName("body_line_2")
    val bodyLine2: String?,
    @SerializedName("body_line_2_icon")
    val bodyLine2Icon: String?,
    @SerializedName("body_line_3")
    val bodyLine3: String?,
    @SerializedName("body_line_3_icon")
    val bodyLine3Icon: String?,
    @SerializedName("first_cta_text")
    val firstCtaText: String?,
    @SerializedName("header_line_1")
    val headerLine1: String?,
    @SerializedName("header_line_2")
    val headerLine2: String?,
    @SerializedName("header_line_2_icon")
    val headerLine2Icon: String?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("primary_cta_text")
    val primaryCtaText: String?,
    @SerializedName("second_cta_text")
    val secondCtaText: String?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("title")
    val title: String?
)