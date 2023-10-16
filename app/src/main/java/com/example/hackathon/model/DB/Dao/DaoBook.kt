package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Books
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoBook {
    @Insert
    fun insert(item: Books)

    @Query("select * from Book")
    fun getListManga() : Flow<List<Books>>
}