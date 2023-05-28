package com.example.pc10

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.navhomework001.R
@Composable
fun HomeScreen(navController: NavHostController) {
    var username:String by remember { mutableStateOf("") }
    var age:String by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ico_tvu
            ),
            contentDescription = "Logo Image"

        )

        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") },
        )
        TextField(
            value = age,
            onValueChange = { age = it },
            label = { Text(text = "BirthDay") },
        )
        val context = LocalContext.current
        Button(
            modifier = Modifier.background(color = Color.Black),
            onClick = {
                navController.navigate("Second/$username/$age")


                /*
        1 - add two variable with state mode : username and password
        2 - complete value and onValueChange for TextField with variables
        3 - in onClick method check username = tvu and password = 111111 or not?
        4 - Toast OK or WRONG in Toast  */
            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57)
            )
        ) {
            Text(
                text = "calculate",
                color = Color(0xFFEDEFEE)
            )
        }

    }}

//fun LoginScreen(){
//
//    }
//}