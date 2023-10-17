package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import com.example.hackathon.model.Debug
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModelAddAuthor : ViewModel()
{
    private val mutablenameFlow = MutableStateFlow("")
    val name = mutablenameFlow.asStateFlow()

    private val mutablefirstnameFlow = MutableStateFlow("")
    val firstName = mutablefirstnameFlow.asStateFlow()

    private val mutablelastnameFlow = MutableStateFlow("")
    val lastname = mutablelastnameFlow.asStateFlow()

    fun getFIO(firstname : String, name:String, lastname : String)
    {
        val debug = Debug()
        mutablenameFlow.value = debug.checknullElementString(name)
        mutablefirstnameFlow.value = debug.checknullElementString(firstname)
        mutablelastnameFlow.value = debug.checknullElementString(lastname)
    }




}