package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Books
import com.example.hackathon.model.DB.Enties.Tags
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoTag {

    @Insert
    fun insert(item: Tags)

    @Query("select * from Tags")
    fun getListManga() : Flow<List<Tags>>
}