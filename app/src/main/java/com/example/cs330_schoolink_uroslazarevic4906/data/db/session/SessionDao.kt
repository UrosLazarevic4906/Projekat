package com.example.cs330_schoolink_uroslazarevic4906.data.db.session

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import java.time.LocalDateTime

@Dao
interface SessionDao {
    @Insert
    suspend fun insertSession(sessionEntity : SessionEntity) : Long

    @Query("SELECT * FROM Session WHERE date = :date AND groupId = :groupId")
    suspend fun getSessions(date : LocalDateTime, groupId : Int) : Flow<List<SessionEntity>>
}