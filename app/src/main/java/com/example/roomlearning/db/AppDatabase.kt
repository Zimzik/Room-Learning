package com.example.roomlearning.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomlearning.db.dao.AuthorDao
import com.example.roomlearning.db.dao.BookDao
import com.example.roomlearning.db.entities.Author
import com.example.roomlearning.db.entities.Book

@Database(entities = [Author::class, Book::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun authorDao(): AuthorDao
    abstract fun bookDao(): BookDao
}