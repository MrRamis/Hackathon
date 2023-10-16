package com.example.hackathon.model.DB.Enties
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tags")
data class Tags(@PrimaryKey(autoGenerate = true) var id : Int? = null,
                @ColumnInfo(name = "Name_tage") var name_tags : String)
