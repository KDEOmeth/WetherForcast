package com.example.weather.weatherforecast.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(private val context: Context) {
  @Singleton @Provides
  fun provideContext(): Context = context
}