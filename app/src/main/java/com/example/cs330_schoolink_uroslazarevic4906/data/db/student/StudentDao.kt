package com.example.cs330_schoolink_uroslazarevic4906.data.db.student

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {
    @Insert
    suspend fun insertStudent(studentEntity : StudentEntity): Long

    @Query("SELECT * FROM Student WHERE firstName = :firstName AND lastName = :lastName")
    suspend fun getStudent(firstName : String, lastName : String): StudentEntity?

    @Query("SELECT * FROM Student WHERE code = :code")
    suspend fun getStudent(code : String): StudentEntity?
}