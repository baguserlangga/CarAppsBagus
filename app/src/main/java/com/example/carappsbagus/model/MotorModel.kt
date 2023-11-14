package com.example.carappsbagus.model

import androidx.room.Entity

@Entity(tableName = "motor")
data class MotorModel (
    val id :Int = 0,
    val mesin : Int,
    val tipe_suspensi :Int,
    val tipe_transmisi  : Int,
)