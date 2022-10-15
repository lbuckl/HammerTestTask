package com.gb.weather.model.room

import androidx.room.*

@Dao
interface MenuItemrDao {

    //region общие запросы
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(menuItemEntity: MenuItemEntity)

    @Update
    fun update(menuItemEntity: MenuItemEntity)

    @Delete
    fun delete(menuItemEntity: List<MenuItemEntity> )
    //endregion

    //Чистит всю базу
    @Query ("DELETE FROM MenuItemEntity")
    fun clearHistory()

    //Возвращает всю базу в обратном порядке
    @Query("SELECT * FROM MenuItemEntity ORDER BY id DESC")
    fun getEntityListInvert(): List<MenuItemEntity>
}