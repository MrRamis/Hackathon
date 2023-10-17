package com.example.hackathon.model

import androidx.room.Entity
import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.viewModel.Book
import org.jetbrains.annotations.NotNull

class model_DeleteDb
{
    fun deleteBook(db: Data,books: Book)
    {
        db.getDaoBook().delete(books)
    }

    fun deleteAuthor(db: Data, i: Author) {
        db.getDaoAuthor().delete(i)
    }
}