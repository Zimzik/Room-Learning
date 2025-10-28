package com.example.roomlearning

import com.example.roomlearning.db.repo.AuthorsRepo
import com.example.roomlearning.db.repo.BooksRepo

class MainActivityViewModel(
    private val authorsRepo: AuthorsRepo,
    private val booksRepo: BooksRepo,
) : BaseViewModel<MainActivityState>(state = MainActivityState()) {

    override fun toString() = "Hello from ${this::class.java.simpleName}"

}