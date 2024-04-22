package com.ajumie.mvvmactivity.ui.theme.Screens.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ajumie.mvvmactivity.navigation.ROUTE_ABOUT
import com.ajumie.mvvmactivity.navigation.ROUTE_HOME
import com.ajumie.mvvmactivity.navigation.ROUTE_REGISTER

@Composable
fun Homescreen(navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)


    )
    {
        Text(
            text = "This is Home Page",
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp

        )
             Button(onClick = {
                       navController.navigate(ROUTE_ABOUT)

             },
                 modifier = Modifier.fillMaxWidth()) {
                 Text(text = "About")
             }

        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)

        },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }
    }

}
@Preview
@Composable
private fun Homeprev(){
    Homescreen(navController = rememberNavController())
}
