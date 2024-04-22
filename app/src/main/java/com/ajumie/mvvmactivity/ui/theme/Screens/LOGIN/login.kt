package com.ajumie.mvvmactivity.ui.theme.Screens.LOGIN

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ajumie.mvvmactivity.navigation.ROUTE_ABOUT
import com.ajumie.mvvmactivity.navigation.ROUTE_LOGIN

@Composable
fun Log (navController:  NavHostController) {


    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
  Column(

      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
      modifier = Modifier
          .fillMaxSize()
          .background(Color.White)



  ) {
      Text(
          text = "LogIn",
          color = Color.White,
          fontFamily = FontFamily.SansSerif,
          fontSize = 25.sp

      )

      Icon(imageVector = Icons.Default.Person, contentDescription = "person")


      OutlinedTextField(
          value =email ,
          onValueChange ={email=it},
          leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription ="email" ) },
          label = { Text(text = "Email Address") },
          modifier = Modifier
              .fillMaxWidth()

      )

      OutlinedTextField(
          value =password ,
          onValueChange ={password=it},
          leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="password" ) },
          label = { Text(text = "Your Password") },


          modifier = Modifier
              .fillMaxWidth()
              .padding(vertical = 8.dp),
          keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
          keyboardActions = KeyboardActions()
      )

      Button(
          onClick = {


              navController.navigate(ROUTE_LOGIN)


          },
          modifier = Modifier.fillMaxWidth()
      ) {
          Text(text = "LogIn ")
      }
  }





}

@Preview
@Composable
private fun Loginprev() {
    Log(navController = rememberNavController() )

}