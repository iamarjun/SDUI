package com.arjun.sdui.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.arjun.sdui.data.model.SectionX


@Composable
fun InfoComponent(modifier: Modifier, data: SectionX) {
    Card(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column(modifier = modifier.padding(16.dp)) {
            InfoTitle(modifier = modifier, label = data.content?.title ?: "")
            InfoSubTitle(modifier = modifier, label = data.content?.subtitle ?: "")
        }
    }

}

@Composable
fun InfoTitle(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.h5
    )
}

@Composable
fun InfoSubTitle(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.subtitle2.copy(color = Color.Gray)
    )
}