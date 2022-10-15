package com.gb.weather.model.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(MenuItemEntity::class), version = 1)
abstract class MenuHistoryDatabase: RoomDatabase() {
    abstract fun weatherDao():MenuItemrDao
}