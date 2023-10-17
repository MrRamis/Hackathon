package com.example.hackathon.viewModel

import kotlinx.coroutines.flow.MutableStateFlow


data class Book(
    var id: Int? = null,
    var name: String = "",
    var describe: String = " ",
    var type: String = "",
    var date: String = "",
)
