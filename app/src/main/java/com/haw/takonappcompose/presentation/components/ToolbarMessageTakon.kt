package com.haw.takonappcompose.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.haw.takonappcompose.R
import com.haw.takonappcompose.ui.theme.BluePrimary
import com.haw.takonappcompose.ui.theme.GrayColor
import com.haw.takonappcompose.ui.theme.GreenColor

@Composable
fun ToolbarMessageTakon(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 16.dp, vertical = 8.dp),
        ) {
            Image(
                modifier = Modifier.align(Alignment.CenterVertically),
                imageVector = Icons.Default.ArrowBack,
                contentDescription = ""
            )

            Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 12.dp),
                painter = painterResource(id = R.drawable.ic_takon_boot),
                contentDescription = ""
            )

            Column(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                Text(
                    text = "TakonGPT",
                    fontSize = 20.sp,
                    color = BluePrimary,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row {
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(6.dp)
                            .background(color = GreenColor, shape = CircleShape)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = "Online",
                        color = GreenColor,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp
                        )
                    )
                }
            }
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp), color = GrayColor
        )
    }
}

@Preview
@Composable
fun ToolbarMessageTakonPreview() {
    ToolbarMessageTakon()
}

