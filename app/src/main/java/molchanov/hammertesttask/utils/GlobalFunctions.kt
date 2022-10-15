package com.gb.weather.shared

import android.view.View
import com.gb.weather.domain.MenuItem
import com.gb.weather.model.room.MenuItemEntity
import com.google.android.material.snackbar.Snackbar
import molchanov.hammertesttask.R

//функция для отображения снэкбара c ошибкой и доп. сообщением
fun View.showSnackBarErrorMsg(
    errorMsg:String,
    text: String = "${rootView.resources.getString(R.string.error)}: $errorMsg",
    length: Int = Snackbar.LENGTH_LONG
) {
    Snackbar.make(this, text, length).show()
}

//функция для отображения информационного снэкбара
fun View.showSnackBarInfoMsg(
    infoMsg:String,
    text: String = "${rootView.resources.getString(R.string.info)}: $infoMsg",
    length: Int = Snackbar.LENGTH_LONG
) {
    Snackbar.make(this, text, length).show()
}

//Функция преобразовывает MenuItemEntity в MenuItem (Из БД Room в Данные)
fun entityListToMenuItemList(entityList:List<MenuItemEntity>):List<MenuItem>{
    return entityList.map {MenuItem(
        it.name,
        it.description + "\n(данные могут быть не актуальны)",
        it.link,
        it.price)  }
}

//Функция преобразовывает объект MenuItem в MenuItemEntity (из Данных в БД Room)
fun dataToEntity(menuItem: MenuItem):MenuItemEntity {
    return MenuItemEntity(0, menuItem.name,menuItem.description,menuItem.link,menuItem.price)
}




