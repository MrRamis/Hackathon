package com.example.hackathon.model.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hackathon.model.DB.Enties.Books

@Dao
interface Dao {

    @Insert
    fun insert(item: Books)

    @Query("select * from Book")
    fun getListManga() : List<Books>


}