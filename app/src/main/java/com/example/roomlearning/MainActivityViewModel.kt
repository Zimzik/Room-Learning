package com.example.roomlearning

import androidx.lifecycle.viewModelScope
import com.example.roomlearning.db.entities.Author
import com.example.roomlearning.db.repo.AuthorsRepo
import com.example.roomlearning.db.repo.BooksRepo
import com.github.javafaker.Faker
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val authorsRepo: AuthorsRepo,
    private val booksRepo: BooksRepo,
) : BaseViewModel<MainActivityState>(state = MainActivityState()) {

    private val faker by lazy { Faker() }

    init {
        subscribeOnAuthors()
    }

    fun addNewAuthor() {
        val authorName = faker.name().fullName()
        val newAuthor = Author(
            name = authorName
        )
        viewModelScope.launch {
            authorsRepo.addAuthor(newAuthor)
        }
    }

    fun deleteUser(author: Author) = viewModelScope.launch {
        authorsRepo.deleteAuthor(author)
    }

    private fun subscribeOnAuthors() {
        viewModelScope.launch {
            authorsRepo.getAllAuthors().collect { authors ->
                updateState { current ->
                    current.copy(authors = authors)
                }
            }
        }
    }

}