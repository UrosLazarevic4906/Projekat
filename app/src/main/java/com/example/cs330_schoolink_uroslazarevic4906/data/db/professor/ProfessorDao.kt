package com.example.cs330_schoolink_uroslazarevic4906.data.db.professor

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProfessorDao {
    @Insert
    suspend fun insertProfessor(professorEntity: ProfessorEntity) : Long

    @Query("SELECT * FROM Professor WHERE (email = :identification OR  code = :identification) AND password = :password")
    suspend fun logIn(identification : String, password : String): ProfessorEntity?
}