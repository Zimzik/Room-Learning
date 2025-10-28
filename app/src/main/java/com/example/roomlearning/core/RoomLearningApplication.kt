package com.example.roomlearning.core

import android.app.Application
import com.example.roomlearning.di.setupDI

class RoomLearningApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        setupDI()
    }

}

