package com.gb.weather.view.weatherlist

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.gb.weather.domain.MenuItem
import molchanov.hammertesttask.R
import molchanov.hammertesttask.databinding.FragmentMarketMenuItemBinding

/**
 * Кастомный адаптер для вывода списка городов в recyclerview
 */
class WeatherListRecyclerAdapter (private val weatherListCity:List<MenuItem>):
    RecyclerView.Adapter<WeatherListRecyclerAdapter.WeatherViewHolder>() {

    //Создаёт ViewHolder объект опираясь на их количество, но с запасом, чтобы можно было скролить
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val binding = FragmentMarketMenuItemBinding.inflate(LayoutInflater.from(parent.context))
        return WeatherViewHolder(binding.root)
    }

    //Связываем используемые текстовые метки с данными
    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(weatherListCity[position])
    }

    //Возвращает количество элементов списка
    override fun getItemCount(): Int {
        return weatherListCity.size
    }

    //Вложенный класс для отображения данных в fragment_weather_list_item.xml
    inner class WeatherViewHolder(view: View): RecyclerView.ViewHolder(view){
        @SuppressLint("SetTextI18n")
        fun bind(menuItem: MenuItem){
            FragmentMarketMenuItemBinding.bind(itemView).apply {
                //imageViewMenuItemPicture.setImageResource(R.drawable.image_pizza)
                imageViewMenuItemPicture.load(menuItem.link)
                textViewName.text = menuItem.name
                textViewDescription.text = menuItem.description
                button.text = "${menuItem.price} р."
            }
        }
    }
}
