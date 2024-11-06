package com.example.cs330_schoolink_uroslazarevic4906.domen.entities

import java.time.LocalDateTime

class Session (
    val id : Int,
    val group : Group,
    val date : LocalDateTime
)