package com.example.hackathon.model.DB
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Manga")
data class Manga(@PrimaryKey(autoGenerate = true)
                var idmanga : Int? = null,
                 @ColumnInfo(name = "Name")
                var namemanga : String,
                 @ColumnInfo(name = "")
                var idtag : Int)
