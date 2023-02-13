package com.example.roompractice

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 2023-02-06
 * pureum
 */
@Entity(tableName = "pureum")
data class Entity(
    @ColumnInfo var time : Int,
    @ColumnInfo var picture : String,
    @ColumnInfo var card: String,
)
{
    @PrimaryKey(autoGenerate = true)
    var idx:Long = 0
}
