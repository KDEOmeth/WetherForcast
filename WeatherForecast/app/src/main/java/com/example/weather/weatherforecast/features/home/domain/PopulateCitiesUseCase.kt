package com.example.weather.weatherforecast.features.home.domain

import javax.inject.Inject

class PopulateCitiesUseCase @Inject constructor(private val citiesRepository: CitiesRepository) {
    suspend fun execute() = citiesRepository.populateCities()
}