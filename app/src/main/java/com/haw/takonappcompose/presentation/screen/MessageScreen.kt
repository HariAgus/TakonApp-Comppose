package com.haw.takonappcompose.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.haw.takonappcompose.models.fromUser
import com.haw.takonappcompose.presentation.components.MessengerItemCard
import com.haw.takonappcompose.presentation.components.ReceiverMessageItemCard
import com.haw.takonappcompose.presentation.components.ToolbarMessageTakon
import com.haw.takonappcompose.presentation.components.WriteMessageCard
import com.haw.takonappcompose.viewmodel.TakonViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageScreen(
    navController: NavController,
    viewModel: TakonViewModel = viewModel()
) {
    val messages by viewModel.messages.collectAsState()
    val loading by viewModel.loading.collectAsState()

    val (input, setInput) = remember { mutableStateOf("") }

    Scaffold(
        containerColor = Color.White,
        topBar = {
            ToolbarMessageTakon()
        },
        floatingActionButton = {
            WriteMessageCard(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
                value = input,
                onValueChange = { value ->
                    setInput(value)
                },
                onClickSend = {
                    if (input.isNotEmpty()) {
                        viewModel.askQuestion(question = input)
                        setInput("")
                    }
                },
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues = paddingValues)
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 8.dp),
                verticalArrangement = Arrangement.spacedBy(space = 8.dp),
                horizontalAlignment = Alignment.End
            ) {
                items(messages) { message ->
                    if (message.fromUser) {
                        MessengerItemCard(
                            modifier = Modifier.align(Alignment.End),
                            message = message.content
                        )
                    } else {
                        ReceiverMessageItemCard(message = message.content)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun MessageScreenPreview() {
    MessageScreen(
        navController = rememberNavController()
    )
}