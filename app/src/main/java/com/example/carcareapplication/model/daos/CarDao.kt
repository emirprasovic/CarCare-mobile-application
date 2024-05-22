package com.example.carcareapplication.model.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.carcareapplication.model.models.CarInformation
import com.example.carcareapplication.model.models.Cars
import com.example.carcareapplication.model.models.ForumPosts
import kotlinx.coroutines.flow.Flow

@Dao
interface CarDao {
    @Insert
    suspend fun insert(car: Cars)
    @Update
    suspend fun update(car: Cars)

    @Delete
    suspend fun delete(car: Cars)

    @Query("SELECT * FROM cars")
    fun getAllCars(): Flow<List<Cars>>

    @Query("SELECT * FROM cars WHERE id = :id")
    fun getCarById(id: Int): Flow<Cars>

    @Query("SELECT * FROM cars WHERE userId = :id")
    fun getCarByUserId(id: Int): Flow<List<Cars>>

    @Query("SELECT * FROM carInformation JOIN cars ON cars.id = carId WHERE carId = :id")
    fun getCarInformation(id: Int): Flow<CarInformation>
}