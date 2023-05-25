package com.chan.codebank.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chan.codebank.App
import com.chan.codebank.ui.theme.CodeBankTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeBankTheme {
               ShowContent()
            }
        }
    }
}

@Composable
fun ShowContent(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background) {
        App()
    }
}


@Preview()
@Composable
fun GreetingPreview() {
    CodeBankTheme {
        ShowContent()
    }
}