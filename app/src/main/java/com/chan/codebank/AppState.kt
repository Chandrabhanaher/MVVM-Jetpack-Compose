package com.chan.codebank

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */


class AppState(val navHostController: NavHostController) {
    fun navigateBack() {
        navHostController.popBackStack()
    }
}

@Composable
fun rememberAppState(navHostController: NavHostController = rememberNavController()) =
    remember(navHostController) {
        AppState(navHostController)
    }