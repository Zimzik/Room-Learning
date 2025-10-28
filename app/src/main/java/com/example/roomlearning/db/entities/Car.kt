package com.example.roomlearning.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cars")
data class Car(
    @PrimaryKey val id: String,
    val model: String,
)
