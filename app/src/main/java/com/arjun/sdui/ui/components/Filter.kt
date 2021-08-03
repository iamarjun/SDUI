package com.arjun.sdui.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arjun.sdui.data.model.SectionX

@Composable
fun FilterComponent(modifier: Modifier, data: SectionX) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row(modifier = modifier) {
            with(data.content) {
                this?.firstCtaText?.let {
                    FirstCta(modifier = modifier, it)
                }

                this?.secondCtaText?.let {
                    SecondCta(modifier = modifier, it)
                }
            }
        }
    }
}

@Composable
fun FirstCta(modifier: Modifier, label: String) {
    Filter1(modifier = modifier, label = label)
}

@Composable
fun SecondCta(modifier: Modifier, label: String) {
    Filter1(modifier = modifier, label = label)
}

@Composable
fun Filter1(modifier: Modifier, label: String) {
    OutlinedButton(
        onClick = { },
        modifier = modifier.padding(16.dp),
        shape = CircleShape
    ) {
        Text(text = label)
        Icon(
            imageVector = Icons.Default.ArrowDropDown,
            contentDescription = "Filter CTA"
        )
    }
}
