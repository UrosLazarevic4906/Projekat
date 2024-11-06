package com.example.cs330_schoolink_uroslazarevic4906.domen.entities

import com.example.cs330_schoolink_uroslazarevic4906.domen.logic.util.SexEnum
import java.time.LocalDateTime

class Professor (
    val id : Int,
    val email : String,
    val password : String,
    val firstName : String,
    val lastName : String,
    val dateOfBirth : LocalDateTime,
    val sex : SexEnum,
    val image: ByteArray,
    val code : String
)