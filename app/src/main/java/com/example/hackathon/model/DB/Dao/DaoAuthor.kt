package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Author

import kotlinx.coroutines.flow.Flow

@Dao
interface DaoAuthor {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Author)

    @Delete
    fun delete(item: Author)

    @Query("select * from Authors")
    fun getListManga() : Flow<List<Author>>


}
