package com.example.hackathon.model

import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.viewModel.Book

class model_InsertDb {
    fun insertAuthor(db : Data,authors : Author){
        db.getDaoAuthor().insert(authors)
    }

    fun insertBook(db : Data, books : Book){
        //db.getDaoBook().insert(books)
    }
}