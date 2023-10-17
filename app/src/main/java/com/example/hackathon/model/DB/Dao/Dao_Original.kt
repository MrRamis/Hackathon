package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.hackathon.model.DB.Enties.Author


@Dao
interface Dao_Original <T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: T)

    @Delete
    fun delete(entity: T)


}