package com.arjun.sdui.ui.components

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.arjun.sdui.data.model.SectionX

@Composable
fun CardComponent(modifier: Modifier, data: SectionX) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = modifier.padding(16.dp),
        ) {
            Row(
                modifier = modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = modifier.padding(8.dp),
                    data.content?.imageUrl
                )

                Spacer(modifier = modifier.width(16.dp))

                Column(modifier = modifier) {
                    Title(modifier = modifier, data.content?.title ?: "")
                    SubTitle(modifier = modifier, data.content?.subtitle ?: "")
                    Headline1(modifier = modifier, data.content?.headerLine1 ?: "")
                    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                        Headline2Icon(
                            modifier = modifier,
                            data.content?.headerLine2Icon ?: ""
                        )
                        Headline2(
                            modifier = modifier.padding(4.dp),
                            data.content?.headerLine2 ?: ""
                        )
                    }
                }
            }

            Divider(modifier = modifier.padding(vertical = 16.dp))

            Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                BodylineIcon1(modifier = modifier.padding(4.dp), Icons.Default.Email)
                Bodyline1(modifier = modifier.padding(4.dp), data.content?.bodyLine1 ?: "")
            }

            Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                BodylineIcon2(modifier = modifier.padding(4.dp), Icons.Default.Phone)
                Bodyline2(modifier = modifier.padding(4.dp), data.content?.bodyLine2 ?: "")
            }

            Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                BodylineIcon3(modifier = modifier.padding(4.dp), Icons.Default.Home)
                Bodyline3(modifier = modifier.padding(4.dp), data.content?.bodyLine3 ?: "")
            }

            PrimaryCta(
                modifier = modifier.align(Alignment.End),
                data.content?.primaryCtaText ?: ""
            )
        }
    }
}

@Composable
fun Image(modifier: Modifier, url: String?) {
    Image(
        modifier = modifier
            .size(86.dp)
            .clip(CircleShape),
        painter = rememberImagePainter(
            data = url,
            builder = {
                transformations(CircleCropTransformation())
            },
        ),
        contentDescription = "display picture"
    )
}

@Composable
fun Title(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.body1
    )
}

@Composable
fun SubTitle(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.subtitle2.copy(color = Color.Gray)
    )
}

@Composable
fun Headline1(modifier: Modifier, label: String) {
    Headline(modifier = modifier, label = label)
}

@Composable
fun Headline2(modifier: Modifier, label: String) {
    Headline(modifier = modifier, label = label)
}

@Composable
fun Headline(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.body2
    )
}

@Composable
fun Headline2Icon(modifier: Modifier, iconUrl: String) {
    Icon(
        modifier = modifier,
        imageVector = Icons.Default.Star,
        contentDescription = "Headline2 icon",
        tint = Color.Green
    )
}

@Composable
fun Bodyline1(modifier: Modifier, label: String) {
    Bodyline(modifier = modifier, label = label)
}

@Composable
fun Bodyline2(modifier: Modifier, label: String) {
    Bodyline(modifier = modifier, label = label)
}

@Composable
fun Bodyline3(modifier: Modifier, label: String) {
    Bodyline(modifier = modifier, label = label)
}

@Composable
fun Bodyline(modifier: Modifier, label: String) {
    Text(
        modifier = modifier,
        text = label,
        style = MaterialTheme.typography.body2
    )
}

@Composable
fun BodylineIcon1(modifier: Modifier, icon: ImageVector) {
    BodylineIcon(modifier = modifier, icon = icon)
}

@Composable
fun BodylineIcon2(modifier: Modifier, icon: ImageVector) {
    BodylineIcon(modifier = modifier, icon = icon)
}

@Composable
fun BodylineIcon3(modifier: Modifier, icon: ImageVector) {
    BodylineIcon(modifier = modifier, icon = icon)
}

@Composable
fun BodylineIcon(modifier: Modifier, icon: ImageVector) {
    Icon(
        modifier = modifier,
        imageVector = icon,
        contentDescription = ""
    )
}

@Composable
fun PrimaryCta(modifier: Modifier, label: String) {
    Button(
        modifier = modifier,
        onClick = { }
    ) {
        Text(
            modifier = modifier,
            text = label
        )
    }
}