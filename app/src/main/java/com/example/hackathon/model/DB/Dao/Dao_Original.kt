package com.example.hackathon.model.DB.Dao

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.hackathon.model.DB.Enties.Author
import kotlinx.coroutines.flow.Flow


@Dao
abstract class Dao_Original <T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insert(entity: T?)

    @Update
    abstract fun update(entity: T?)

    @Delete
    abstract fun delete(entity: T?)

}