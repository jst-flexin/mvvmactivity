package com.ajumie.mvvmactivity.ui.theme.Screens.Register

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ajumie.mvvmactivity.navigation.ROUTE_ABOUT
import com.ajumie.mvvmactivity.navigation.ROUTE_LOGIN
import com.ajumie.mvvmactivity.navigation.ROUTE_REGISTER

@Composable
fun Register (navController: NavHostController){
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(text = "REGISTRATION",
            color = Color.Red,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive )
        Icon(imageVector = Icons.Default.Person, contentDescription = "person")

        OutlinedTextField(
            value =username ,
            onValueChange ={username=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription ="person" ) },
            label = { Text(text = "Your Userame") },


            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )

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







        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register",
                fontSize = 22.sp)


        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {

            navController.navigate(ROUTE_LOGIN)

        },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "LogIn",
                fontSize = 22.sp)


        }
    }

}





@Preview
@Composable
private fun registerprev() {
    Register(navController = rememberNavController())
}