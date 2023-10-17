package com.example.hackathon.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hackathon.view.ui.theme.HackathonTheme
import kotlinx.coroutines.flow.MutableStateFlow

class AddBook : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(modifier: Modifier = Modifier) {
    var text by rememberSaveable {
        mutableStateOf("")
    }
    var text2 by rememberSaveable {
        mutableStateOf("")
    }
    var text3 by rememberSaveable {
        mutableStateOf("")
    }
    var selectedOption by remember { mutableStateOf("Тип произведения") }
    var expanded by remember { mutableStateOf(false) }
    Column (verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Добавить книгу", modifier = Modifier.padding(10.dp), style = MaterialTheme.typography.titleLarge)
        Row {
            Text(text = "Год", modifier = Modifier.padding(start = 5.dp, end = 50.dp))
            TextField(value = text, onValueChange = {text=it}, label = { Text(text = "year")} )
        }
        Row {
            Text(text = "Название", modifier = Modifier.padding(start = 5.dp, end = 5.dp))
            TextField(value = text2, onValueChange ={text2 = it} , label = { Text(text = "NameBook")})
        }
        Row {
            Text(text = "Описание", modifier = Modifier.padding(start = 5.dp, end = 5.dp))
            TextField(value = text3, onValueChange ={text3 = it} , label = { Text(text = "Describe")})
        }
        Row{
            Button(onClick = {expanded = true}) {
                Text(text = selectedOption)
            }
            Box(Modifier.offset(x = 10.dp, y = 10.dp)) {
                DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false}) {
                    DropdownMenuItem(onClick = {selectedOption = "Манга"}, text = { Text(text = "Манга")})
                    DropdownMenuItem(onClick = {selectedOption = "Ранобэ"}, text = { Text(text = "Ранобэ")})
                    DropdownMenuItem(onClick = {selectedOption = "Манхвуа"}, text = { Text(text = "Манхвуа")})
                    DropdownMenuItem(onClick = {selectedOption = "Авторское"}, text = { Text(text = "Авторское")})
                }
            }

        }
        Button(onClick = {}) {
            Text(text = "Cохранить")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HackathonTheme {
        Greeting()
    }
}