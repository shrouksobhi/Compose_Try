package com.example.composetest.ui.commonViews

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintSet
import com.example.composetest.R

@Composable
fun DrawList(data: List<String>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
        content = {
//            items(data){
//
//            }
            items(data) { value->
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(horizontal = 8.dp, vertical = 10.dp)
                    .background(
                        colorResource(id = R.color.purple),
                        shape = RoundedCornerShape(20.dp)
                    )){
                    Image(modifier = Modifier.padding(start = 24.dp, top = 24.dp),painter = painterResource(id = R.drawable.heart), contentDescription = "heart",
                        contentScale = ContentScale.Crop
                    )


                    DrawImage(painter = painterResource(id = R.drawable.bro), contentDescription = "image",
                        modifier =Modifier.width(100.dp).height(100.dp).padding(top = 24.dp) .shadow(2.dp, RoundedCornerShape(100),true), title ="" )

                    Text(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, top = 24.dp), style = TextStyle(
                        Color.Black, fontWeight = FontWeight(700)
                    ),text = value)
                }
            }

        })
}

//fun DrawItem(){
//    val constraint= ConstraintSet()
//}