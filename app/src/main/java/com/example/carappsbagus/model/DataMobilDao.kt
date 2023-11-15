package com.example.carappsbagus.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DataMobilDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaksi(kendaraanModel: KendaraanModel)
    @Delete
    suspend fun deleteTransaksi(kendaraanModel: KendaraanModel)
    @Query("SELECT * FROM kendaraan ORDER BY id ASC")
    fun getTransaksiOrderdById(): kotlinx.coroutines.flow.Flow<List<KendaraanModel>>
}