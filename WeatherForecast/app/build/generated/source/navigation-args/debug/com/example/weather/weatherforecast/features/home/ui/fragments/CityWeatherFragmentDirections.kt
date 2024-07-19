package com.example.weather.weatherforecast.features.home.ui.fragments

import androidx.navigation.NavDirections
import com.example.weather.weatherforecast.NavGraphDirections
import com.example.weather.weatherforecast.features.home.data.models.City

class CityWeatherFragmentDirections private constructor() {
  companion object {
    fun actionNavigateToSearchCityFragment(): NavDirections =
        NavGraphDirections.actionNavigateToSearchCityFragment()

    fun actionNavigateToCityWeatherFragment(city: City): NavDirections =
        NavGraphDirections.actionNavigateToCityWeatherFragment(city)
  }
}
