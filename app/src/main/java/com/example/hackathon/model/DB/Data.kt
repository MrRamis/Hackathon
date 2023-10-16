//package com.example.hackathon.model.DB
//
//import Dao
//import android.content.Context
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//
//
//
//abstract class Data : RoomDatabase() {
//
//    abstract fun getDao() : Dao
//    companion object
//    {
//        fun getDb(context: Context):Data{
//            return Room.databaseBuilder(
//                context.applicationContext,
//                Data::class.java,
//                "testData.db"
//            ).build()
//        }
//    }
//}