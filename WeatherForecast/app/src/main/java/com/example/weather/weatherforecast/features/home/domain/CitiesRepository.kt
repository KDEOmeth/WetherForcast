package com.example.weather.weatherforecast.features.home.domain

import com.example.weather.weatherforecast.features.home.data.models.City
import com.example.weather.weatherforecast.features.home.data.models.WeatherData
import com.example.weather.weatherforecast.utils.result.Resource
import kotlinx.coroutines.flow.Flow

interface CitiesRepository {
  suspend fun populateCities()

  suspend fun updateCity(city: City)

  fun getAllCities(): Flow<List<City>>

  fun getFavoriteCities(): Flow<List<City>>

  fun searchForCity(query: String): Flow<List<City>>

  suspend fun setDefaultCity(cityName: String?, countryCode: String?): Int

  fun getCityWeatherById(cityId: Int): Flow<Resource<List<WeatherData>>>
}