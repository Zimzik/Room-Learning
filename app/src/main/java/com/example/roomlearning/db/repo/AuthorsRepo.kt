package com.example.roomlearning.db.repo

import com.example.roomlearning.db.entities.Author
import kotlinx.coroutines.flow.Flow

interface AuthorsRepo {

    fun getAllAuthors(): Flow<List<Author>>

    suspend fun findAuthorByName(name: String): List<Author>

    suspend fun addAuthor(author: Author)

    suspend fun deleteAuthor(author: Author)

}