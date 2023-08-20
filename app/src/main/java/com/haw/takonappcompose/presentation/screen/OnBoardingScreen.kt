package com.haw.takonappcompose.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haw.takonappcompose.R
import com.haw.takonappcompose.ui.theme.BluePrimary

@Composable
fun OnBoardingScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 28.dp, end = 28.dp, top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "You AI Assistant",
                    color = BluePrimary,
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Using this software,you can ask you\n" +
                            "questions and receive articles using\n" +
                            "artificial intelligence assistant",
                    textAlign = TextAlign.Center
                )

                Image(
                    modifier = Modifier
                        .height(400.dp)
                        .padding(top = 84.dp)
                        .fillMaxWidth(),
                    painter = painterResource(id = R.drawable.img_on_boarding),
                    contentDescription = ""
                )
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 34.dp),
                colors = ButtonDefaults.buttonColors(containerColor = BluePrimary),
                onClick = { /*TODO*/ }) {
                Text(
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                    text = "Continue"
                )

                Image(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.ArrowForward,
                    colorFilter = ColorFilter.tint(color = Color.White),
                    contentDescription = ""
                )

            }
        }
    }
}

@Preview
@Composable
fun OnBoardingScreePreview() {
    OnBoardingScreen()
}