package com.example.hackathon.view.MrR

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hackathon.R
import com.example.hackathon.ui.theme.HackathonTheme
import com.example.hackathon.view.DefaultPreview
import com.example.hackathon.view.NameList
import com.example.hackathon.viewModel.Book
//import com.example.hackathon.viewModel.ViewModelGetBook

class ViewAddAuthorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    AddAuthorActivity()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddAuthorActivity() {


}
@Composable
fun AddAu(){
    Text(text = "yhtf")
}


@Preview
@Composable
fun AddAuthorActivityPreview(){
    ScaffoldExample()
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {


    Scaffold(
        topBar = {
            TopAppBar(

                title = {
                    Text(text = "Добовление автора")
                },
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary)
            {
                Button(onClick = { /*TODO*/ } ) {
                    Text(text = "добавить")
                }

            }
        },
        content = {

                Author()

        }
    )
}

@Composable
fun Author() {
    var number1S by remember { mutableStateOf("") }
    var number2S by remember { mutableStateOf("") }
    var number3S by remember { mutableStateOf("") }
    Column {
        textFilde(
            number = number2S,
            label = ("имя"),
            onChanger = { number2S = it })
        textFilde(
            number = number1S,
            label = ("имя"),
            onChanger = { number1S = it })
        textFilde(
            number = number1S,
            label = ("Фамилия"),
            onChanger = { number1S = it })
        textFilde(
            number = number3S,
            label = ("Отчество"),
            onChanger = { number3S = it })
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFilde(number: String,
                label : String,
                onChanger: (String)-> Unit,
                modifier: Modifier = Modifier) {
    TextField(
        value = number, onValueChange = {
            onChanger(it)
        },
        label = {
            Text(
                label,
                style = MaterialTheme.typography.labelMedium
            )
        }, shape = MaterialTheme.shapes.medium,
        modifier = modifier
    )
}