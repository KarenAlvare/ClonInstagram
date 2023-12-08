package com.example.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
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

        val stories = listOf(
            Story(userNickname = "Janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Mariel", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Karen", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Erick", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Jesus", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Isa", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Alvaro", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "doe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Janedoe_Janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickname = "Jan", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),

        )
        
        StoryList(stories = stories)
    }
}

@Composable
fun StoryList(stories:List<Story>){
    LazyRow(){
        itemsIndexed(stories) {_,item ->
           StoryItem(story = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}