package com.example.hackathon.model.DB.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.example.hackathon.model.DB.Enties.Author


@Dao
abstract interface Dao_Original <T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(entity: Author)

    @Update
    abstract fun update(entity: T?)

    @Delete
    abstract fun delete(entity: T?)

}