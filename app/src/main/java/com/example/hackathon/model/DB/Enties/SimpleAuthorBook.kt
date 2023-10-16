package com.example.hackathon.model.DB.Enties

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "SimpleAuthorBook")
data class SimpleAuthorBook(@ColumnInfo(name = "Id_Author") var id_athor : Int,
                            @ColumnInfo(name = "Id_Book") var id_book : Int)