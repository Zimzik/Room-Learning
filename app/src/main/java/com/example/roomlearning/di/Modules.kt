package com.example.roomlearning.di

import androidx.room.Room
import com.example.roomlearning.MainActivityViewModel
import com.example.roomlearning.db.AppDatabase
import com.example.roomlearning.db.repo.AuthorsRepo
import com.example.roomlearning.db.repo.BooksRepo
import com.example.roomlearning.db.repo.impl.AuthorsRepoImpl
import com.example.roomlearning.db.repo.impl.BooksRepoImpl
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


val viewModelsModule = module {
    viewModelOf(::MainActivityViewModel)
}

val databaseModule = module {
    single<AppDatabase> {
        Room.databaseBuilder(get(), AppDatabase::class.java, "app_database").build()
    }

    single<AuthorsRepo> {
        val database: AppDatabase = get()
        AuthorsRepoImpl(dao = database.authorDao())
    }

    single<BooksRepo> {
        val database: AppDatabase = get()
        BooksRepoImpl(dao = database.bookDao())
    }
}