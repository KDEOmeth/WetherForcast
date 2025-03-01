package com.example.weather.weatherforecast.features.home.ui.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.weather.weatherforecast.R
import com.example.weather.weatherforecast.databinding.ItemWeatherForecastBinding
import com.example.weather.weatherforecast.features.home.data.models.WeatherData
import com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter.WeatherViewHolder
import com.example.weather.weatherforecast.utils.layoutInflater
import com.example.weather.weatherforecast.utils.toReadableDateTime

class WeatherAdapter : ListAdapter<WeatherData, WeatherViewHolder>(callback) {

  companion object {
    private val callback = object : DiffUtil.ItemCallback<WeatherData>() {
      override fun areItemsTheSame(oldItem: WeatherData, newItem: WeatherData) =
        oldItem.id == newItem.id

      override fun areContentsTheSame(oldItem: WeatherData, newItem: WeatherData) =
        oldItem == newItem
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
    val binding = ItemWeatherForecastBinding.inflate(parent.layoutInflater, parent, false)
    return WeatherViewHolder(binding)
  }

  override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
    holder.bindItem(getItem(position))
  }

  inner class WeatherViewHolder(private val binding: ItemWeatherForecastBinding) :
    ViewHolder(binding.root) {
    private val context: Context by lazy { binding.root.context }
    fun bindItem(item: WeatherData) {
      binding.tvTemp.text = context.getString(R.string.temp_, item.main.temp.toString())
      binding.tvDate.text = item.date.toReadableDateTime()
      binding.tvDescription.text =
        if (item.weatherList.isNotEmpty()) item.weatherList[0].toString() else ""
    }
  }
}