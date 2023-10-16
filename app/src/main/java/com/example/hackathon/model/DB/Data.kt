package com.example.hackathon.model.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database (entities = [Manga::class], version = 1)
abstract class Data : RoomDatabase() {


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