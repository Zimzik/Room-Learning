package com.example.roomlearning.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.roomlearning.db.entities.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {

    @Query("SELECT * FROM books ")
    fun getAll(): Flow<List<Book>>

    @Query("SELECT * FROM books WHERE name LIKE :name")
    suspend fun findByName(name: String): List<Book>

    @Insert
    suspend fun insert(book: Book)

    @Delete
    suspend fun delete(book: Book)
}