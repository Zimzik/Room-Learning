package com.example.roomlearning

import com.example.roomlearning.db.entities.Author

data class MainActivityState(
    val authors: List<Author> = emptyList()
)