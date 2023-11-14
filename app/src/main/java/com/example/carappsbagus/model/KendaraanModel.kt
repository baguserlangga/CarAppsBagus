package com.example.carappsbagus.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kendaraan")
data class KendaraanModel (
    @PrimaryKey(autoGenerate = true)
    val id :Int = 0,
    val tahun_keluaran : Int,
    val warna :Int,
    val harga  : Int,
    )