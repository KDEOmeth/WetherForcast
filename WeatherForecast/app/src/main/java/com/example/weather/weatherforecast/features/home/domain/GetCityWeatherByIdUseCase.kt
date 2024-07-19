package com.example.weather.weatherforecast.features.home.domain

import com.example.weather.weatherforecast.features.home.data.models.WeatherData
import com.example.weather.weatherforecast.utils.result.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCityWeatherByIdUseCase @Inject constructor(private val citiesRepository: CitiesRepository) {

    fun get(cityId: Int): Flow<Resource<List<WeatherData>>> = citiesRepository.getCityWeatherById(cityId)
}