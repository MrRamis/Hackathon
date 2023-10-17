package com.example.hackathon.view.MrR

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hackathon.ui.theme.HackathonTheme
import com.example.hackathon.viewModel.Book_test
//import com.example.hackathon.viewModel.ViewModelGetBook

class ViewGetBookActivity(): ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         val viewModelGetBook = ViewModelGetBook(Book(1,"Ведьмаг дикая охота","«Сага о ведьмаке» — цикл книг польского писателя Анджея Сапковского в жанре фэнтези.\n" +
//                 "\n" +
//                 "Первый рассказ цикла увидел свет в 1986 году, а последняя книга — в 2013. Действие книг происходит в вымышленном Мире «Ведьмака», напоминающем Европу времён позднего средневековья, где рядом с людьми существуют разного рода волшебные существа и чудовища.\n" +
//                 "\n" +
//                 "Геральт из Ривии — один из последних «ведьмаков», бродячих охотников на чудовищ","Книга","2015")
//         )
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //GetBookActivity(viewModelGetBook)
                }
            }
        }
    }
     fun onCreate(savedInstanceState: Bundle?, book: Book_test) {
        super.onCreate(savedInstanceState)
        //val viewModelGetBook = ViewModelGetBook(book)
        setContent {
            HackathonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                   // GetBookActivity(viewModelGetBook)
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun GetBookActivity(viewModel: ViewModelGetBook) {
//Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
//    val vm by viewModel.book.collectAsState()
//    Text(text = vm.name)
//    Row(modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceAround
//    ) {
//        Text(text = vm.date)
//        Text(text = vm.type)
//    }
//    Text(text = vm.describe)
//
//
//}
//}


@Preview
//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GetBookActivityPrevew(){
    /*val viewModelGetBook = ViewModelGetBook(Book(1,"Ведьмаг дикая охота","«Сага о ведьмаке» — цикл книг польского писателя Анджея Сапковского в жанре фэнтези.\n" +
            "\n" +
            "Первый рассказ цикла увидел свет в 1986 году, а последняя книга — в 2013. Действие книг происходит в вымышленном Мире «Ведьмака», напоминающем Европу времён позднего средневековья, где рядом с людьми существуют разного рода волшебные существа и чудовища.\n" +
            "\n" +
            "Геральт из Ривии — один из последних «ведьмаков», бродячих охотников на чудовищ","Книга","2015")
    )*/
    //GetBookActivity(viewModelGetBook)
}
