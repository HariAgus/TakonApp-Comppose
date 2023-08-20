package com.haw.takonappcompose.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haw.takonappcompose.R
import com.haw.takonappcompose.ui.theme.GrayColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WriteMessageCard(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shadowElevation = 8.dp,
        color = Color.White,
        shape = RoundedCornerShape(30.dp),
    ) {
        TextField(
            modifier = Modifier.background(color = Color.White),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    text = "Write your message",
                    fontWeight = FontWeight.Bold
                )
            },
            trailingIcon = {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.ic_send_message),
                    contentDescription = ""
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                placeholderColor = GrayColor,
                containerColor = Color.White
            )
        )
    }
}

@Preview
@Composable
fun WriteMessageCardPreview() {
    WriteMessageCard()
}

