package com.example.cs330_schoolink_uroslazarevic4906.data.db.student

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cs330_schoolink_uroslazarevic4906.domen.logic.util.SexEnum
import java.time.LocalDateTime

@Entity(
    tableName = "Student"
)
data class StudentEntity(
    val firstName : String,
    val lastName : String,
    val dateOfBirth : LocalDateTime,
    val email : String,
    val sex : SexEnum,
    val description: String,
    val image: ByteArray,
    val code : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)