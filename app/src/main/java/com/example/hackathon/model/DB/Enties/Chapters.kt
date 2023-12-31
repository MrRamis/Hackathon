package com.example.hackathon.model.DB.Enties

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Chapters")
data class Chapters (@PrimaryKey(autoGenerate = true) var id : Int? = null,
                     @ColumnInfo(name = "name") var name_chapter : String,
                     @ColumnInfo(name = "describe") var describe : String? = null)