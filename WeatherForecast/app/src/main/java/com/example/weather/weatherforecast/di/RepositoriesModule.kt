package com.example.weather.weatherforecast.di

import com.example.weather.weatherforecast.features.home.data.CitiesRepositoryImpl
import com.example.weather.weatherforecast.features.home.domain.CitiesRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RepositoriesModule {
  @Singleton @Binds
  abstract fun bindCitiesRepository(citiesRepository: CitiesRepositoryImpl?): CitiesRepository?
}