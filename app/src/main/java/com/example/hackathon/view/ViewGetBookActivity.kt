package com.example.hackathon.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hackathon.ui.theme.HackathonTheme
import com.example.hackathon.viewModel.Book
import com.example.hackathon.viewModel.ViewModelGetBook

class ViewGetBookActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModelGetBook = ViewModelGetBook()
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    GetBookActivity(viewModelGetBook)
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun GetBookActivity(viewModel: ViewModelGetBook) {
Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
    val vm by viewModel.book.collectAsState()
    Text(text = vm.name)
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = vm.date)
        Text(text = vm.type)
    }
    Text(text = vm.describe)

    
}
}


@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GetBookActivityPrevew(){
    val viewModelGetBook = ViewModelGetBook()
    GetBookActivity(viewModelGetBook)
}
