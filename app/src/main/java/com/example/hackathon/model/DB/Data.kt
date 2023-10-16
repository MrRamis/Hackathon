package com.example.hackathon.model.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hackathon.model.DB.Dao.DaoAuthor
import com.example.hackathon.model.DB.Dao.DaoBook
import com.example.hackathon.model.DB.Dao.DaoChapters
import com.example.hackathon.model.DB.Dao.DaoTag
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.model.DB.Enties.Books
import com.example.hackathon.model.DB.Enties.Chapters
import com.example.hackathon.model.DB.Enties.SimpleAuthorBook
import com.example.hackathon.model.DB.Enties.SimpleTagsBooks
import com.example.hackathon.model.DB.Enties.StateBook
import com.example.hackathon.model.DB.Enties.Tags


@Database(entities = [Chapters::class, Author::class, Books::class, SimpleAuthorBook::class, SimpleTagsBooks::class, StateBook::class, Tags::class], version = 1)
abstract class Data : RoomDatabase() {

    abstract fun getDaoAuthor() : DaoAuthor
    abstract fun getDaoBook() : DaoBook
    abstract fun getDaoTag() : DaoTag
    abstract fun getDaoChapter() : DaoChapters
    companion object
    {
        fun getDb(context: Context):Data{
            return Room.databaseBuilder(
                context.applicationContext,
                Data::class.java,
                "Data.db"
            ).build()
        }
    }
}