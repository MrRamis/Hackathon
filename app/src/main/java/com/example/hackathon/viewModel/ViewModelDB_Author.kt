package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import com.example.hackathon.model.DB.Data
import com.example.hackathon.model.DB.Enties.Author
import com.example.hackathon.model.modelCreateTable
import com.example.hackathon.model.model_DeleteDb
import com.example.hackathon.model.model_InsertDb

class ViewModelDB_Author : ViewModel() {

    private val modelCreateTable = modelCreateTable()
    private val model_Ins = model_InsertDb()
    private val model_Del = model_DeleteDb()
    fun createTableAuthor(firstname : String, name : String, lastname : String) : Author
    {
        return modelCreateTable.createTableAuthor(firstname, name, lastname)
    }
    fun insertAuthor(db : Data, vararg authors : Author){
        for(i in authors)
            model_Ins.insertAuthor(db,i)
    }
    fun deleteAuthor(db: Data, vararg author: Author)
    {
        for (i in author)
            model_Del.deleteAuthor(db,i)
    }
}