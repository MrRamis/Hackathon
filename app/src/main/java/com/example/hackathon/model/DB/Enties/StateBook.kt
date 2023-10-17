package com.example.hackathon.model.DB.Enties

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hackathon.model.DB.StateBookEnum

@Entity("Status")
data class StateBook (@PrimaryKey var id_book : Int, @ColumnInfo(name = "status") var status : String)
