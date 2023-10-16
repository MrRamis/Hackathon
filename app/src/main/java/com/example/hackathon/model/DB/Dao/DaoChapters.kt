package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Chapters
import kotlinx.coroutines.flow.Flow

@Dao
interface DaoChapters {
    @Insert
    fun insert(item: Chapters)

    @Query("select * from Chapters")
    fun getListManga() : Flow<List<Chapters>>
}