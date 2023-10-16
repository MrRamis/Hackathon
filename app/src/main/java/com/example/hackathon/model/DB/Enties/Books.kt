package com.example.hackathon.model.DB.Enties
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.format.DateTimeFormatter
@Entity(tableName = "Book")
data class Books(@PrimaryKey(autoGenerate = true)
                var id : Int? = null,
                 @ColumnInfo(name = "Name")
                var name : String,
                 @ColumnInfo(name = "Describe")
                var describe : String,
                @ColumnInfo(name = "Type")
                var type : String,
                @ColumnInfo(name = "Data")
                var year: LocalDate
                )
