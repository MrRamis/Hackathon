package com.example.hackathon.model

import com.example.hackathon.model.DB.Dao.Dao_Original
import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.model.DB.Enties.Books
import com.example.hackathon.viewModel.Book

class model_InsertDb {
    fun insertAuthor(db : Data,authors : Author){
        db.getDaoAuthor().insert(item = authors)
    }

    fun insertBook(db : Data, books : Book){
        db.getDaoBook().insert(item = books)
    }
}