package com.example.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagram.data.Story

@Composable
fun HomeScreen() {

    Column (modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)) {

        InstagramToolBar()

        StoryItem(story = Story(userNickname = "Janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"))
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}