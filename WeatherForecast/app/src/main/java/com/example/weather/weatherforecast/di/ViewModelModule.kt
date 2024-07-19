package com.example.weather.weatherforecast.di

import androidx.lifecycle.ViewModel
import com.example.weather.weatherforecast.di.annotitions.ViewModelKey
import com.example.weather.weatherforecast.features.home.ui.viewmodels.WeatherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
  @Binds @IntoMap @ViewModelKey(WeatherViewModel::class)
  abstract fun provideWeatherViewModel(weatherViewModel: WeatherViewModel): ViewModel
}