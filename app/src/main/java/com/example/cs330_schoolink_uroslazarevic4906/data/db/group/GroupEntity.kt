package com.example.cs330_schoolink_uroslazarevic4906.data.db.group

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.cs330_schoolink_uroslazarevic4906.data.db.professor.ProfessorEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.student.StudentEntity

@Entity(
    tableName = "Group",
    foreignKeys = [
    ForeignKey(
        entity = StudentEntity::class,
        parentColumns = ["id"],
        childColumns = ["studentId"],
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(
        entity = ProfessorEntity::class,
        parentColumns = ["id"],
        childColumns = ["professorId"],
        onDelete = ForeignKey.CASCADE
    )
    ]
)
data class GroupEntity(
    val name : String,
    val studentId : Int,
    val professorId : Int,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)
