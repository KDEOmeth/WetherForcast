package com.example.weather.weatherforecast.features.home.domain

import com.example.weather.weatherforecast.features.home.data.models.City
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchForCityUseCase @Inject constructor(private val citiesRepository: CitiesRepository) {
  fun get(query: String): Flow<List<City>> = citiesRepository.searchForCity(query)
}