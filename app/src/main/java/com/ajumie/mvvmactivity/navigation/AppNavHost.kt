package com.ajumie.mvvmactivity.navigation

import android.content.Intent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajumie.mvvmactivity.ui.theme.Screens.About.About
import com.ajumie.mvvmactivity.ui.theme.Screens.Home.Homescreen
import com.ajumie.mvvmactivity.ui.theme.Screens.LOGIN.Log
import com.ajumie.mvvmactivity.ui.theme.Screens.Register.Register
import com.ajumie.mvvmactivity.ui.theme.Screens.Splash.SplashScreen


@Composable
fun AppNavhost(modifier: Modifier=Modifier,navController: NavHostController=rememberNavController(),
               startDestination:String= ROUTE_SPLASH){
NavHost(navController = navController, modifier = modifier, startDestination = startDestination){
   composable(ROUTE_HOME){
       Homescreen(navController)
   }
    composable(ROUTE_ABOUT){
        About(navController)
    }
    composable(ROUTE_SPLASH){
        SplashScreen(navController )
    }
    composable(ROUTE_REGISTER){
       Register(navController )
    }
    composable(ROUTE_LOGIN){
        Log(navController)
    }
}


}