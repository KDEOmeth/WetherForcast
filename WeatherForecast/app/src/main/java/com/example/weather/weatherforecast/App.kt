package com.example.weather.weatherforecast

import android.app.Application
import com.example.weather.weatherforecast.di.AppComponent
import com.example.weather.weatherforecast.di.ContextModule
import com.example.weather.weatherforecast.di.DaggerAppComponent

class App : Application() {
  lateinit var appComponent: AppComponent
    private set

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.factory()
      .create(ContextModule(this))
  }
}