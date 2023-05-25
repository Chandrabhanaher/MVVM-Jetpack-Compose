@file:OptIn(ExperimentalMaterial3Api::class)

package com.chan.codebank.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chan.codebank.R


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */

@Composable
fun Login(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {

        val username = rememberSaveable { mutableStateOf("") }
        val password = rememberSaveable { mutableStateOf("") }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .systemBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = stringResource(R.string.account),
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

//          Username
            OutlinedTextField(
                value = username.value,
                onValueChange = { data -> username.value = data },
                label = { Text(text = stringResource(R.string.username)) },
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(10.dp))

//          Password
            OutlinedTextField(
                value = password.value,
                onValueChange = { data -> password.value = data },
                label = { Text(text = stringResource(R.string.password)) },
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.small,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate("home")
                },
                enabled = true,
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)) {
                Text(text = stringResource(R.string.login))
            }
        }
    }
}