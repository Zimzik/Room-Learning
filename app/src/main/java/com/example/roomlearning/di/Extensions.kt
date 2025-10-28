package com.example.roomlearning.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

fun Application.setupDI() {
    startKoin {
        androidLogger(Level.INFO)
        androidContext(this@setupDI)
    }
}