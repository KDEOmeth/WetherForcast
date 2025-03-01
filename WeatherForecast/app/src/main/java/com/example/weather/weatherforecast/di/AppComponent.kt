package com.example.weather.weatherforecast.di

import android.content.Context
import com.example.weather.weatherforecast.features.home.ui.activities.MainActivity
import com.example.weather.weatherforecast.features.home.ui.fragments.CityWeatherFragment
import com.example.weather.weatherforecast.features.home.ui.fragments.HomeFragment
import com.example.weather.weatherforecast.features.home.ui.fragments.SearchCityFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    ContextModule::class, ViewModelModule::class, RepositoriesModule::class,
    RoomModule::class, WebServiceModule::class, PrefsModule::class
  ]
)
interface AppComponent {
  val context: Context

  // activities
  fun inject(mainActivity: MainActivity?)

  // fragments
  fun inject(homeFragment: HomeFragment?)
  fun inject(cityWeatherFragment: CityWeatherFragment?)
  fun inject(searchCityFragment: SearchCityFragment)

  @Component.Factory
  interface Factory {
    fun create(contextModule: ContextModule): AppComponent
  }
}