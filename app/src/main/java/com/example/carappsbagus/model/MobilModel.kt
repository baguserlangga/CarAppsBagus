package com.example.carappsbagus.model

import androidx.room.Entity

@Entity(tableName = "mobil")
data class MobilModel (
    val id :Int = 0,
    val mesin : Int,
    val kapasitas_penumpang :Int,
    val tipe  : Int,
        )