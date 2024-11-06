package com.example.cs330_schoolink_uroslazarevic4906.domen.entities

import com.example.cs330_schoolink_uroslazarevic4906.domen.logic.util.SexEnum
import java.time.LocalDateTime

class Student(
    val id : Int,
    val firstName : String,
    val lastName : String,
    val dateOfBirth : LocalDateTime,
    val email : String,
    val sex : SexEnum,
    val description: String,
    val image: ByteArray,
    val code : String
)