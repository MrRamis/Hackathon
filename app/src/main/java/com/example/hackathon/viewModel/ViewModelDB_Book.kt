package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.TypeBook
import com.example.hackathon.model.modelCreateTable
import com.example.hackathon.model.model_DeleteDb
import com.example.hackathon.model.model_InsertDb
import java.time.LocalDate

class ViewModelDB_Book : ViewModel() {
    private val modelCreateTable = modelCreateTable()
    private val model_Ins = model_InsertDb()
    private val model_Del = model_DeleteDb()
    fun createTableBook(name : String, describe : String, type : TypeBook, date : LocalDate) : Book
    {
         return modelCreateTable.createTableBook(name,describe,type,date.toString())
    }
    fun insertBook(db : Data, vararg books : Book){
        for(i in books)
            model_Ins.insertBook(db, i)
    }
    fun deleteBook(db:Data, vararg books: Book)
    {
        for (i in books)
            model_Del.deleteBook(db,i)
    }



}