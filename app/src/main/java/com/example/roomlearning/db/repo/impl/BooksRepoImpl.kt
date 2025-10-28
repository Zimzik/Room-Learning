package com.example.roomlearning.db.repo.impl

import com.example.roomlearning.db.dao.BookDao
import com.example.roomlearning.db.entities.Book
import com.example.roomlearning.db.repo.BooksRepo

class BooksRepoImpl(private val dao: BookDao): BooksRepo {
    override fun getAllBooks() = dao.getAll()

    override suspend fun findBookByName(name: String) = dao.findByName(name)

    override suspend fun addBook(book: Book) = dao.insert(book)

    override suspend fun deleteBook(book: Book) = dao.delete(book)

}