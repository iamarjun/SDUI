package com.arjun.sdui.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle

@Composable
fun NavComponent() {
    TopAppBar(
        navigationIcon = {
            BackCta()
        },
        title = {
            Title()
        },
        actions = {

        }
    )
}


@Composable
fun Title() {
    Text(
        text = "",
        style = TextStyle(),
    )
}

@Composable
fun BackCta() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back CTA"
        )
    }
}
