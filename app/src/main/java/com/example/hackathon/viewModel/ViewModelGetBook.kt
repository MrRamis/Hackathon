package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ViewModelGetBook(private val _book: Book ) : ViewModel() {
    var book = MutableStateFlow(_book)
}