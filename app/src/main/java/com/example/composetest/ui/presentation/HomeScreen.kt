package com.example.composetest.ui.presentation

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.composetest.ui.commonViews.DrawList

@Composable
fun HomeContent(navController: NavController){
    val scaffoldState = rememberScaffoldState()

    val data= listOf("one","two","three","four")
     DrawList(data =data )
}