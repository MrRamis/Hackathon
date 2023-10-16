package com.example.hackathon.view
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hackathon.ui.theme.HackathonTheme
import androidx.compose.runtime.mutableStateOf


import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.TextField


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    DefaultPreview()
                }
            }
        }
    }
}




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun MyScreenContent() {
   // var isWindowOpen by remember { mutableStateOf(false) }
    var isAlertDialogVisible by remember { mutableStateOf(false) }
    var titleText by remember { mutableStateOf("") }
    var contentText by remember { mutableStateOf("") }
    var  isAlertDialogVisible2 by remember { mutableStateOf(false) }
    var titleText2 by remember { mutableStateOf("") }
    var contentText2 by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "")
                },
                navigationIcon ={
                    Row{
                        Button(onClick = {  }) {
                            Text(text = "All")
                                //border = BorderStroke(3.dp, Color.DarkGray)
                            //Icon(Icons.Default.Add, contentDescription = "Reading")
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "Read")
                        }
                        //spacer()
                        //Spacer(modifier = Modifier.weight(0.5f))
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "Next")
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "Fav")
                            //materialIcon()
                        }
                    }

                },
                actions = {
                    Row {
                        IconButton(onClick = { isAlertDialogVisible = true}) {
                            Icon(Icons.Default.Add, contentDescription = "Author")
                            if (isAlertDialogVisible) {
                                AlertDialog(
                                    onDismissRequest = { isAlertDialogVisible = false },
                                    // Отслеживаем запрос на закрытие окна
                                    title = {  TextField(
                                        value = titleText,
                                        onValueChange = { titleText = it },
                                        label = { Text("Автор") }
                                    ) },
//                                    text = {
//                                        TextField(
//                                            value = contentText,
//                                            onValueChange = { contentText = it },
//                                            label = { Text("Содержимое окна") }
//                                        )
//                                    },
                                    confirmButton = {
                                        Button(
                                            onClick = { isAlertDialogVisible = false } // Закрыть окно при нажатии на кнопку подтверждения
                                        ) {
                                            Text(text = "Подтвердить")
                                        }
                                    },
                                    dismissButton = {
                                        Button(
                                            onClick = { isAlertDialogVisible = false } // Закрыть окно при нажатии на кнопку отмены
                                        ) {
                                            Text(text = "Отмена")
                                        }
                                    }
                                )
                            }
                        }
                        IconButton(onClick = { isAlertDialogVisible2 = true }) {
                            Icon(Icons.Default.Add, contentDescription = "Book")
                            if (isAlertDialogVisible2) {
                                AlertDialog(
                                    onDismissRequest = { isAlertDialogVisible2 = false },
                                    // Отслеживаем запрос на закрытие окна
                                    title = {  TextField(
                                        value = titleText2,
                                        onValueChange = { titleText2 = it },
                                        label = { Text("Название книги") }
                                    ) },
                                    text = {
                                        TextField(
                                            value = contentText2,
                                            onValueChange = { contentText2 = it },
                                            label = { Text("Автор") }
                                        )
                                    },
                                    confirmButton = {
                                        Button(
                                            onClick = { isAlertDialogVisible2 = false } // Закрыть окно при нажатии на кнопку подтверждения
                                        ) {
                                            Text(text = "Подтвердить")
                                        }
                                    },
                                    dismissButton = {
                                        Button(
                                            onClick = { isAlertDialogVisible2 = false } // Закрыть окно при нажатии на кнопку отмены
                                        ) {
                                            Text(text = "Отмена")
                                        }
                                    }
                                )
                            }
//
                        }
                    }

                }
            )
        },
        content = {
            //Column {

                //Divider()
                NameList(names = listOf("Alice", "Charlie"))
            //}
        }
    )
}


@Composable
fun Spacer(weight: Modifier) {

}



@Composable
fun NameList(names: List<String>) {
   Column {
        for (name in names) {
            Text(text = name, modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyScreenContent()
}