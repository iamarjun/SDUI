package com.arjun.sdui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Choice(
    @SerializedName("id")
    val id: String?,
    @SerializedName("layout")
    val layout: Layout?,
    @SerializedName("page_meta")
    val pageMeta: PageMeta?,
    @SerializedName("sections")
    val sections: List<Section>?,
)