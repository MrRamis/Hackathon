package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Books
import com.example.hackathon.viewModel.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoBook {
    @Insert
    fun insert(item: Book)

    @Delete
    fun delete(item: Book)

    @Query("select * from Book")
    fun getListManga() : Flow<List<Books>>
}