package com.example.hackathon.model

import com.example.hackathon.model.TypeBook
import java.time.LocalDate

class Debug {

    fun checknullElementString(element: String?) : String
    {
        if(element == null)
            return ""
        return element
    }
    fun checknullElementDate(element: LocalDate?) : LocalDate
    {
        if(element == null)
            return LocalDate.now()
        else
            if (element > LocalDate.now())
                return LocalDate.now()
        return element
    }
    fun checknullElementState(element: TypeBook?) : TypeBook
    {
        if(element == null)
            return TypeBook.EMPTY
        return element
    }

}