package com.gb.weather.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MenuItem(
    val name: String,
    val description: String,
    val link: String,
    var price: Double
): Parcelable{
    init {
        if (price < 0) price = 10000.0
    }
}

//TODO Тестовый лсит для проверки вывода информации в reciclerView
fun getCities(): List<MenuItem> {
    return listOf(
        MenuItem("Пицца",
            "Пицца с анчоусами и ананасами и ещё что-то Пицца с анчоусами и ананасами и ещё что-то",
            "https://cdn-icons-png.flaticon.com/512/6121/6121817.png", 500.0),
        MenuItem("Пицца",
            "Пицца с бараниной",
            "https://cdn-icons-png.flaticon.com/512/6121/6121817.png", 510.0),
        MenuItem("Пицца",
            "Пицца с вегитарианская",
            "https://cdn-icons-png.flaticon.com/512/6121/6121817.png", 520.0),
        MenuItem("Пицца",
            "Пицца с грибами",
            "https://cdn-icons-png.flaticon.com/512/6121/6121817.png", 530.0),
        MenuItem("Пицца",
            "Пицца с курицей",
            "https://cdn-icons-png.flaticon.com/512/6121/6121817.png", 540.0),
    )
}