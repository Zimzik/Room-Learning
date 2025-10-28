package com.example.roomlearning.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.roomlearning.db.entities.Author
import kotlinx.coroutines.flow.Flow

@Dao
interface AuthorDao {

    @Query("SELECT * FROM authors")
    fun getAll(): Flow<List<Author>>

    @Query("SELECT * FROM authors WHERE name LIKE :name")
    suspend fun findByName(name: String): List<Author>

    @Insert
    suspend fun insert(author: Author)

    @Delete
    suspend fun delete(author: Author)
}