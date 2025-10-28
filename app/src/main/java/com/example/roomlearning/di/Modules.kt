package com.example.roomlearning.di

import androidx.room.Room
import com.example.roomlearning.db.AppDatabase
import org.koin.dsl.module

val databaseModule = module {
    single<AppDatabase> {
        Room.databaseBuilder(get(), AppDatabase::class.java, "app_database").build()
    }
}