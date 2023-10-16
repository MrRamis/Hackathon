package com.example.hackathon.model.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hackathon.model.DB.Enties.Books


@Database (entities = [Books::class], version = 1)
abstract class Data : RoomDatabase() {

    abstract fun getDao() : Dao
    companion object
    {
        fun getDb(context: Context):Data{
            return Room.databaseBuilder(
                context.applicationContext,
                Data::class.java,
                "testData.db"
            ).build()
        }
    }
}