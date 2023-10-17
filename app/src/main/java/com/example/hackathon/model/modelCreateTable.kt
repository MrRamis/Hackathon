package com.example.hackathon.model

import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.viewModel.Book


class modelCreateTable {
    fun createTableAuthor(firstname : String, name : String, lastname : String) : Author
    {
        return Author(id = null, first = firstname, name = name, last = lastname)
    }
    fun createTableBook(name : String, describe : String, type : TypeBook, date : String) : Book
    {
        return Book(id = null, name = name, describe = describe, type = type.name, date = date)
    }
}