package com.example.carappsbagus.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DataMobil {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaksi(transaksiQrs: KendaraanModel)
    @Delete
    suspend fun deleteTransaksi(transaksiQrs: KendaraanModel)
    @Query("SELECT * FROM kendaraan ORDER BY id ASC")
    fun getTransaksiOrderdById(): kotlinx.coroutines.flow.Flow<List<KendaraanModel>>
}