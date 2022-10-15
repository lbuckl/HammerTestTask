package com.gb.weather.shared

import android.view.View
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




