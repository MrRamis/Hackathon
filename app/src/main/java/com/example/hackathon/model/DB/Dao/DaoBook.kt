package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Books
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoBook : Dao_Original<Books> {
    @Query("select * from Book")
    fun getListManga() : List<Books>
}