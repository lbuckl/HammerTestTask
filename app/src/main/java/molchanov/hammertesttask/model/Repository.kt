package com.gb.weather.model
import com.gb.weather.domain.MenuItem


//Интерфейс для запроса истории открытия погоды room
interface WeatherRequestHistory{
    fun getHistoryList():List<MenuItem>
    fun addMenuItemsToHistory(menuItemList: List<MenuItem>)
    fun clearHistory()
}