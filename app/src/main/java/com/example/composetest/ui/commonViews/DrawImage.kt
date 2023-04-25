package com.example.composetest.ui.commonViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun DrawImage(painter: Painter, contentDescription: String, modifier: Modifier, title: String) {
    Card(modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(10.dp), elevation = 5.dp) {
        Box(modifier = Modifier.height(100.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {

            }
        }
    }
}
