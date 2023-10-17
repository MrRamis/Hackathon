package com.example.hackathon.view.MrR
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.example.hackathon.R
import com.example.hackathon.navigation.NavGraph


class MainActivityRa : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
                NameList(names = listOf("book", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author", "author"))
            }
        }
    )
}


@Composable
fun Spacer(weight: Modifier) {

}



@Composable
fun NameList(names: List<String>) {
    Column {
        //Spacer(modifier = Modifier.weight(1f))
        Row {


            for (name in names) {
                Text(text = "ree", modifier = Modifier.padding(16.dp))

            }
        }
//сделать диначический row
        Row {

            for (name in names) {
                Text(text = name, modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyScreenContent()
}