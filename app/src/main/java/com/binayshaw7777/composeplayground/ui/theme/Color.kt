package com.binayshaw7777.composeplayground.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val silverDark = Color(0xFFC4C4C4)
val silverLight = Color(0xFFF5F5F5)

val goldenDark = Color(0xFFD9BB40)
val goldenLight = Color(0xFFFDEC67)

val silverGradient: Brush = Brush.linearGradient(
    colors = listOf(silverDark, silverLight, silverDark, silverLight, silverDark)
)

val goldenGradient: Brush = Brush.linearGradient(
    colors = listOf(goldenDark, goldenLight, goldenDark, goldenLight, goldenDark)
)