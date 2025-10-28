package com.example.roomlearning.db.repo

import com.example.roomlearning.db.entities.Book
import kotlinx.coroutines.flow.Flow

interface BooksRepo {

    fun getAllBooks(): Flow<List<Book>>

    suspend fun findBookByName(name: String): List<Book>

    suspend fun addBook(book: Book)

    suspend fun deleteBook(book: Book)

}