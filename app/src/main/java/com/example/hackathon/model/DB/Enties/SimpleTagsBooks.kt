package com.example.hackathon.model.DB.Enties


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SimpleTagsBooks")
data class SimpleTagsBooks (@PrimaryKey var id_author : Int,
                            @ColumnInfo(name = "Id_Tag") var id_tag : Int)
