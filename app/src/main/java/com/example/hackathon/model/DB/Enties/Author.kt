package com.example.hackathon.model.DB.Enties

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Authors")
data class Author(
    @PrimaryKey(autoGenerate = true) var id: Int? = null,
    @ColumnInfo(name = "firstName") var first: String,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "lastName") var last: String? = null
)
