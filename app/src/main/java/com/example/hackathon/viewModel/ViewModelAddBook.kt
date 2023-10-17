package com.example.hackathon.viewModel

import androidx.lifecycle.ViewModel
import com.example.hackathon.model.Debug
import com.example.hackathon.model.TypeBook
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.LocalDate

class ViewModelAddBook : ViewModel() {


    private val mutablenameFlow = MutableStateFlow("")
    val name = mutablenameFlow.asStateFlow()

    private val mutabledescribeFlow = MutableStateFlow("")
    val describe = mutabledescribeFlow.asStateFlow()

    private val mutabletypeFlow = MutableStateFlow(TypeBook.AUTHOR)
    val type = mutabletypeFlow.asStateFlow()

    private val mutabledateFlow = MutableStateFlow<LocalDate>(LocalDate.now())
    val date = mutabledateFlow.asStateFlow()

    fun getbook(name:String?, describe : String?){
        val debug = Debug()
        mutablenameFlow.value = debug.checknullElementString(name)
        mutabledescribeFlow.value = debug.checknullElementString(describe)
    }

    fun getbook(name:String?, describe : String?, type : TypeBook?, date : LocalDate?){
        val debug = Debug()
        mutablenameFlow.value = debug.checknullElementString(name)
        mutabledescribeFlow.value = debug.checknullElementString(describe)
        mutabletypeFlow.value = debug.checknullElementState(type)
        mutabledateFlow.value = debug.checknullElementDate(date)
    }
}