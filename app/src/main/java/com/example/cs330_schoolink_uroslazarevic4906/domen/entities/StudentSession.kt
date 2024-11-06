package com.example.cs330_schoolink_uroslazarevic4906.domen.entities

class StudentSession (
    val id : Int,
    val session: Session,
    val student: Student,
    val activity: Boolean,
    val attendance: Boolean,
)