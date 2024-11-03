package com.example.cs330_schoolink_uroslazarevic4906.data.db.studentSessions

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.cs330_schoolink_uroslazarevic4906.data.db.session.SessionEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.student.StudentEntity

@Entity(
    tableName = "StudentSessions",
    foreignKeys = [
        ForeignKey(
            entity = StudentEntity::class,
            parentColumns = ["id"],
            childColumns = ["studentId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = SessionEntity::class,
            parentColumns = ["id"],
            childColumns = ["sessionId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class StudentSessionEntity(
    val studentId: Int,
    val sessionId: Int,
    val activity: Boolean,
    val attendance: Boolean,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
