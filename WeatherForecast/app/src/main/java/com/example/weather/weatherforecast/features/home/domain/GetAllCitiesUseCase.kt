package com.example.weather.weatherforecast.features.home.domain

import com.example.weather.weatherforecast.features.home.data.models.City
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllCitiesUseCase @Inject constructor(private val citiesRepository: CitiesRepository) {

  fun get(): Flow<List<City>> = citiesRepository.getAllCities()
}