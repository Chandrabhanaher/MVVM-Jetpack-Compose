package com.chan.codebank

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chan.codebank.ui.home.Home
import com.chan.codebank.ui.login.Login
import com.chan.codebank.ui.payment.Payment


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
@Composable
fun App(appState: AppState  = rememberAppState()) {

    NavHost(
        navController = appState.navHostController,
        startDestination = "login"
    ){
        composable("login"){
            Login(navController = appState.navHostController)
        }

        composable("home"){
            Home(navController = appState.navHostController)
        }

        composable("payment"){
            Payment(navController = appState.navHostController)
        }
    }

}