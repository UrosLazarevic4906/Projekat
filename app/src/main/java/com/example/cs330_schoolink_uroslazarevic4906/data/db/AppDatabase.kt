package com.example.cs330_schoolink_uroslazarevic4906.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.cs330_schoolink_uroslazarevic4906.data.db.group.GroupDao
import com.example.cs330_schoolink_uroslazarevic4906.data.db.group.GroupEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.professor.ProfessorDao
import com.example.cs330_schoolink_uroslazarevic4906.data.db.professor.ProfessorEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.session.SessionDao
import com.example.cs330_schoolink_uroslazarevic4906.data.db.session.SessionEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.student.StudentDao
import com.example.cs330_schoolink_uroslazarevic4906.data.db.student.StudentEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.studentSessions.StudentSessionEntity
import com.example.cs330_schoolink_uroslazarevic4906.data.db.studentSessions.StudentSessionsDao
import com.example.cs330_schoolink_uroslazarevic4906.domen.logic.util.DateTimeConverter

@Database(
    entities = [
        StudentEntity::class,
        ProfessorEntity::class,
        GroupEntity::class,
        SessionEntity::class,
        StudentSessionEntity::class
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(DateTimeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract val studentDao: StudentDao
    abstract val professorDao: ProfessorDao
    abstract val groupDao: GroupDao
    abstract val sessionDao: SessionDao
    abstract val studentSessionDao: StudentSessionsDao

    companion object {
        const val DATABASE_NAME = "Schoolink"
    }
}
