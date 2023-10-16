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

import androidx.compose.material.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button


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
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "")
                },
                navigationIcon ={
                    Row{
                        Button(onClick = {  }) {
                            Text(text = "Все")
                                //border = BorderStroke(3.dp, Color.DarkGray)
                            //Icon(Icons.Default.Add, contentDescription = "Reading")
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "read")
                        }
                        //spacer()
                        //Spacer(modifier = Modifier.weight(0.5f))
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "future")
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = "fav")
                            //materialIcon()
                        }
                    }

                },
                actions = {
                    Row {
                        IconButton(onClick = { /* Handle navigation icon click */ }) {
                            Icon(Icons.Default.Add, contentDescription = "Menu")
                        }
                        IconButton(onClick = { /* Handle navigation icon click */ }) {
                            Icon(Icons.Default.Add, contentDescription = "add")
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