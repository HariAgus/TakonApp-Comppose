package com.haw.takonappcompose.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haw.takonappcompose.viewmodel.TakonViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.haw.takonappcompose.presentation.components.MessengerItemCard
import com.haw.takonappcompose.presentation.components.ReceiverMessageItemCard
import com.haw.takonappcompose.presentation.components.ToolbarMessageTakon
import com.haw.takonappcompose.presentation.components.WriteMessageCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageScreen(viewModel: TakonViewModel = viewModel()) {
    Scaffold(
        containerColor = Color.White,
        topBar = {
            ToolbarMessageTakon()
        },
        floatingActionButton = {
            WriteMessageCard(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues = paddingValues)
        ) {
            MessengerItemCard(
                modifier = Modifier.align(Alignment.End)
            )

            ReceiverMessageItemCard()
        }
    }
}

@Preview
@Composable
fun MessageScreenPreview() {
    MessageScreen()
}