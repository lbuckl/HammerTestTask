package com.gb.weather.model

import com.gb.weather.MyApp
import com.gb.weather.domain.MenuItem
import com.gb.weather.shared.dataToEntity
import com.gb.weather.shared.entityListToMenuItemList

object RepositoryRequestHistory:WeatherRequestHistory {

    //Вернуть список отсортированный в порядке обратном добавлению объектов
    override fun getHistoryList(): List<MenuItem> {
        return entityListToMenuItemList(MyApp.getWeatherDatabase().weatherDao().getEntityListInvert())
    }

    //функция очищает старую историю и добавляет новую
    override fun addMenuItemsToHistory(menuItemList: List<MenuItem>) {
        Thread{
            MyApp.getWeatherDatabase().weatherDao().also {
                it.clearHistory()
                Thread.sleep(300)
                for (menuItem in menuItemList){
                    it.insert(dataToEntity(menuItem))
                }
            }
        }.start()
    }

    override fun clearHistory() {
        Thread{MyApp.getWeatherDatabase().weatherDao().clearHistory()}.start()
    }
}