package com.example.roompractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.roompractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext, Database::class.java,
            "pureumDBBBBBB"
        ).build()


        binding.button.setOnClickListener{
            Thread(kotlinx.coroutines.Runnable {
                db.pureumDao().insert(Entity(1,"hello","nice" ))
                Log.e("TAG", "insert: 성공", )
            }).start()
        }

        binding.button2.setOnClickListener{
            Thread(kotlinx.coroutines.Runnable {
                Log.e("TAG", "${db.pureumDao().getAll()}", )
                Log.e("TAG", "getAll: 성공", )
            }).start()
        }




    }
}