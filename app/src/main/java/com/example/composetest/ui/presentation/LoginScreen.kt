package com.example.composetest.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composetest.R
import com.example.composetest.navigation.NavRoute
import com.example.composetest.ui.commonViews.DrawButton
import com.example.composetest.ui.commonViews.DrawImage

@Composable
fun Login(navController: NavController) {
    val scaffoldState = rememberScaffoldState()

    val painter = painterResource(id = R.drawable.bro)
    val scope = rememberCoroutineScope()
    var userNameTextState by remember { mutableStateOf("") }
    var PasswordTextState by remember { mutableStateOf("") }
    //  val painter = painterResource(id = R.drawable.bro)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 24.dp)
    ) {
        DrawImage(
            painter = painter,
            contentDescription = "bro logo",
            modifier = Modifier.width(100.dp),
            title = ""
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(
            value = userNameTextState,
            onValueChange = {
                userNameTextState = it
            },
            label = { Text("User Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.LightGray,
                focusedLabelColor = Color.Blue,
                unfocusedLabelColor = Color.LightGray
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Text
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = PasswordTextState, onValueChange = {
            PasswordTextState = it
        }, label = { Text("Password") }, singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.LightGray,
                focusedLabelColor = Color.Blue,
                unfocusedLabelColor = Color.LightGray
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Password
            )
        )
        //   Spacer(modifier = Modifier.fillMaxHeight(10f))
        Spacer(modifier = Modifier.height(50.dp))
        DrawButton(scaffoldState = scaffoldState, text = "Sign In") {
            navController.navigate(NavRoute.HomeScreen.routs)
        }
    }
}