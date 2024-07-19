package com.example.weather.weatherforecast.utils.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.weather.weatherforecast.features.home.data.converters.WeatherListConverter
import com.example.weather.weatherforecast.features.home.data.local.CitiesDao
import com.example.weather.weatherforecast.features.home.data.local.WeathersDao
import com.example.weather.weatherforecast.features.home.data.models.City
import com.example.weather.weatherforecast.features.home.data.models.WeatherData

@Database(entities = [City::class, WeatherData::class], version = 1, exportSchema = false)
@TypeConverters(
  WeatherListConverter::class
)
abstract class MainRoomDatabase : RoomDatabase() {
  abstract fun citiesDao(): CitiesDao
  abstract fun weathersDao(): WeathersDao
}
