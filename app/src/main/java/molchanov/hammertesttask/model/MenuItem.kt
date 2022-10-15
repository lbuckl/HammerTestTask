package com.gb.weather.domain

import android.os.Parcelable
import android.util.Log
import kotlinx.parcelize.Parcelize

/**
 * Класс хранящий данные элементов меню
 * @param name - намиенование блюда
 * @param description - описание блюда
 * @param link - ссылка на фото блюда
 * @param price - цена блюда
 */
@Parcelize
data class MenuItem(
    val name: String,
    val description: String,
    val link: String,
    var price: Double
): Parcelable{
    //Защита от неверного ввода цены
    init {
        Log.w("ErrorPeice","Не корректный воод цены, присвоена максимальная цена")
        if (price < 1) price = 10000.0
    }
}