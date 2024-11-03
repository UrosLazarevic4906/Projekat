package com.example.cs330_schoolink_uroslazarevic4906.data.db.session

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.cs330_schoolink_uroslazarevic4906.data.db.group.GroupEntity
import java.time.LocalDateTime

@Entity(
    tableName = "Session",
    foreignKeys = [
        ForeignKey(
            entity = GroupEntity::class,
            parentColumns = ["id"],
            childColumns = ["groupId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class SessionEntity(
    val groupId : Int,
    val date : LocalDateTime,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)
