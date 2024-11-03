package com.example.cs330_schoolink_uroslazarevic4906.data.db.group

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface GroupDao {
    @Insert
    suspend fun isertGroup(groupEntity : GroupEntity) : Long

    @Query("SELECT * FROM `Group` WHERE id = :professorId")
    suspend fun getAllProfessorGroups(professorId : Int) : Flow<List<GroupEntity>>

    @Update
    suspend fun updateGroup(groupEntity: GroupEntity) : Int

    @Delete
    suspend fun deleteGroup(groupEntity: GroupEntity) : Int
}