package com.example.cs330_schoolink_uroslazarevic4906.data.db.studentSessions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import java.time.LocalDateTime

@Dao
interface StudentSessionsDao {
    @Insert
    suspend fun insertStudentSession(studentSessionEntity : StudentSessionEntity) : Long

    @Query("""
        SELECT * FROM StudentSessions 
        WHERE sessionId IN (
            SELECT id FROM Session 
            WHERE groupId = :groupId AND date = :date
        )
    """)
    fun getStudentSessionsForGroupOnDate(groupId: Int, date: LocalDateTime): Flow<List<StudentSessionEntity>>
}