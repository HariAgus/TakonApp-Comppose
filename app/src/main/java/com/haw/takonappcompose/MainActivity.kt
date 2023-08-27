package com.haw.takonappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.haw.takonappcompose.navigation.MainNavGraph
import com.haw.takonappcompose.presentation.screen.SplashScreen
import com.haw.takonappcompose.ui.theme.TakonAppComposeTheme

class MainActivity : ComponentActivity() {

    private var isClickLong = false
    var age: Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TakonAppComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainNavGraph(navController = rememberNavController())
                }
            }
        }
    }

}