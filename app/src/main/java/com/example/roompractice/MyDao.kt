package com.example.roompractice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * 2023-02-06
 * pureum
 */
@Dao
interface MyDao {
    @Query("SELECT * From pureum")
    fun getAll(): List<Entity>

    @Insert
    fun insert(aa: Entity)

    @Query("DELETE FROM pureum")
    fun deleteAll()
}