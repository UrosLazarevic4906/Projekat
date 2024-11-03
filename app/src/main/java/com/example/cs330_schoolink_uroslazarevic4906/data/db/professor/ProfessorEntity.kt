package com.example.cs330_schoolink_uroslazarevic4906.data.db.professor

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cs330_schoolink_uroslazarevic4906.domen.logic.util.SexEnum
import java.time.LocalDateTime


@Entity(
    tableName = "Professor"
)
data class ProfessorEntity(
    val email : String,
    val password : String,
    val firstName : String,
    val lastName : String,
    val dateOfBirth : LocalDateTime,
    val sex : SexEnum,
    val code : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)
