package com.example.roomlearning.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "driver_licences")
data class DriverLicence(
    @PrimaryKey val id: String
)
