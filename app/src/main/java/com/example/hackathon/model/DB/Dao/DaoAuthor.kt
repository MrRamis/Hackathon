package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Author

import kotlinx.coroutines.flow.Flow

@Dao
interface DaoAuthor {

    @Insert
    fun insert(item: Author)

    @Query("select * from Authors")
    fun getListManga() : Flow<List<Author>>


}
