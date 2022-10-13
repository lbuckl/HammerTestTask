package com.gb.weather.view.weatherlist

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gb.weather.domain.City
import molchanov.hammertesttask.databinding.FragmentMarketMenuItemBinding

/**
 * Кастомный адаптер для вывода списка городов в recyclerview
 */
class WeatherListRecyclerAdapter (private val weatherListCity:List<City>):
    RecyclerView.Adapter<WeatherListRecyclerAdapter.WeatherViewHolder>() {

    init {
        Log.v("@@@",weatherListCity.size.toString())
    }

    //Создаёт ViewHolder объект опираясь на их количество, но с запасом, чтобы можно было скролить
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val binding = FragmentMarketMenuItemBinding.inflate(LayoutInflater.from(parent.context))
        return WeatherViewHolder(binding.root)
    }

    //Связываем используемые текстовые метки с данными
    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(weatherListCity[position])

        holder.itemView.setOnClickListener{
            //TODO
        }
    }

    //Возвращает количество элементов списка
    override fun getItemCount(): Int {
        Log.v("@@@","Size")
        return weatherListCity.size
    }

    //Вложенный класс для отображения данных в fragment_weather_list_item.xml
    inner class WeatherViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(city: City){
            val binding = FragmentMarketMenuItemBinding.bind(itemView)
            binding.cityItem.text = city.name
        }
    }
}
