package com.example.roompractice

import androidx.room.RoomDatabase

/**
 * 2023-02-06
 * pureum
 */
@androidx.room.Database(entities = [Entity::class], version = 3)
abstract class Database :RoomDatabase() {
    abstract fun pureumDao():MyDao

//    companion object{
//        private var instance:Database? = null
//
//        @Synchronized
//        fun getInstance(context: Context): Database?{
//            if(instance == null)
//                synchronized(Database::class){
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        Database::class.java,
//                        "pureum.db"
//                    ).build()
//                }
//            return instance
//        }
//
//        fun destroyInstance(){
//            instance = null
//        }
//    }
}