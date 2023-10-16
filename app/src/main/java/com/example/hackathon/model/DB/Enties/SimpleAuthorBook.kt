package com.example.hackathon.model.DB.Enties

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SimpleAuthorBook")
data class SimpleAuthorBook(@PrimaryKey var id_athor : Int,
                            @ColumnInfo("Id_book") var id_book : Int)