package com.example.roomlearning.db.repo.impl

import com.example.roomlearning.db.dao.AuthorDao
import com.example.roomlearning.db.entities.Author
import com.example.roomlearning.db.repo.AuthorsRepo

class AuthorsRepoImpl(private val dao: AuthorDao): AuthorsRepo {

    override fun getAllAuthors() = dao.getAll()

    override suspend fun findAuthorByName(name: String) = dao.findByName(name)

    override suspend fun addAuthor(author: Author) = dao.insert(author)

    override suspend fun deleteAuthor(author: Author) = dao.delete(author)

}