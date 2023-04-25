package com.example.composetest.ui.commonViews

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetest.R
import kotlinx.coroutines.launch

@Composable
fun DrawButton(scaffoldState: ScaffoldState, text:String,onClicked:()->Unit){
    val scope = rememberCoroutineScope()
    Button(
        onClick = {
            onClicked()
        },
        modifier = Modifier
            .width(240.dp)
            .height(50.dp),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(0.5.dp, Color.White), colors = ButtonDefaults.outlinedButtonColors(backgroundColor = colorResource(
            id = R.color.dark_blue
        )
        )
    ) {
        Text(text, textAlign = TextAlign.Center, style = TextStyle(Color.White, fontSize = 14.sp))
    }

}