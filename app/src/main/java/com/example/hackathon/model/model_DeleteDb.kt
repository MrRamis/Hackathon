package com.example.hackathon.model

import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.model.DB.Enties.Books
import com.example.hackathon.viewModel.Book_test

class model_DeleteDb
{
    fun deleteBook(db: Data,books: Books)
    {
        db.getDaoBook().delete(books)
    }

    fun deleteAuthor(db: Data, i: Author) {
        db.getDaoAuthor().delete(i)
    }
}