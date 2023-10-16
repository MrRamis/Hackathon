package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ViewModelGetBook : ViewModel() {
    private val _book: Book= Book(1,"Ведьмаг дикая охота","«Сага о ведьмаке» — цикл книг польского писателя Анджея Сапковского в жанре фэнтези.\n" +
            "\n" +
            "Первый рассказ цикла увидел свет в 1986 году, а последняя книга — в 2013. Действие книг происходит в вымышленном Мире «Ведьмака», напоминающем Европу времён позднего средневековья, где рядом с людьми существуют разного рода волшебные существа и чудовища.\n" +
            "\n" +
            "Геральт из Ривии — один из последних «ведьмаков», бродячих охотников на чудовищ","Книга","2015")
    var book = MutableStateFlow(_book)
}