package com.gb.weather.model.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MenuItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val description: String,
    val link: String,
    val price: Double
)