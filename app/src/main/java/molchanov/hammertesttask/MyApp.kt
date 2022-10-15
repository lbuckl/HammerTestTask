package com.gb.weather

import android.app.Application
import androidx.room.Room
import com.gb.weather.model.room.MenuHistoryDatabase
import com.gb.weather.shared.ROOM_DB_NAME


class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        myApp = this
    }

    companion object {
        private var myApp: MyApp? = null
        private var menuHistoryDatabase: MenuHistoryDatabase? = null

        fun getMyApp() = myApp!!
        //База данных истории запросов
        fun getWeatherDatabase(): MenuHistoryDatabase {
            if (menuHistoryDatabase == null) {
                menuHistoryDatabase = Room.databaseBuilder(
                    getMyApp(),
                    MenuHistoryDatabase::class.java,
                    ROOM_DB_NAME
                ).allowMainThreadQueries()
                    .build()
            }
            return menuHistoryDatabase!!
        }
    }
}