@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.example.composetest


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composetest.navigation.Navigate
import com.example.composetest.ui.commonViews.DrawList
import com.example.composetest.ui.presentation.HomeContent
import com.example.composetest.ui.presentation.Register


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Navigate()
        }
    }
}








