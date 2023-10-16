package com.example.hackathon.model.DB

import android.content.ClipData.Item
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Insert
    fun Insert(item: Item)

    @Query("select * from Manga")
    fun getListManga() : List<Item>
}