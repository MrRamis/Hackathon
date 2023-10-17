package com.example.hackathon.view.MrR
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hackathon.R
import com.example.hackathon.model.DB.Dao.DaoBook
import com.example.hackathon.model.DB.Data
import com.example.hackathon.navigation.NavGraph
import com.example.hackathon.navigation.Screens


class MainActivityRa : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  ////////////////////////  val book =
                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun MyScreenContent(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "")
                },
                navigationIcon ={
                    Row{
                        Button(onClick = {   }) {
                            Text(text = stringResource(id = R.string.allbtn))
                                //border = BorderStroke(3.dp, Color.DarkGray)
                            //Icon(Icons.Default.Add, contentDescription = "Reading")
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = stringResource(id = R.string.readbtn))
                        }
                        //spacer()
                        //Spacer(modifier = Modifier.weight(0.5f))
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = stringResource(id = R.string.futurebtn))
                        }
                        Button(onClick = { /* Handle navigation icon click */ }) {
                            Text(text = stringResource(id = R.string.favbtn))
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
            Column {
                Divider()
                NameList(names = listOf("book", "authogfdgdfgdfgfdgdfgr", "author",
                    "autdfgdfgdfgdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgdfhor",
                    "author", "audfgdfgdfgthor")
                    ,navController)
            }
        }
    )
}



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NameList(names: List<String>,navController: NavController) {
    LazyColumn() {
        items(names) { bo ->
            Bootem(bo, navController)
        }
    }
}
@Composable
fun Bootem(bo: String,navController: NavController) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                navController.navigate(Screens.GetBook.route)
            }
    ) {
        //places its children in a horizontal sequence.
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            //places its children in a vertical sequence.
            Column(
                modifier = Modifier
                    .weight(6f, true)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp),
            ) {
                //used to display text

                Text(
                    text = "by ${bo}"
                    )

            }
        }
    }
}

















@Preview
@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    NavGraph(navController = navController)
    MyScreenContent(navController)
}