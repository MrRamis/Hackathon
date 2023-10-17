package com.example.hackathon.view.MrR

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hackathon.ui.theme.HackathonTheme

/*class ViewAddAuthorActivity : ComponentActivity() {
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
}*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddAuthorActivity() {
    ScaffoldExample()


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