// Generated by Dagger (https://dagger.dev).
package com.example.weather.weatherforecast.features.home.data;

import android.content.Context;
import com.example.weather.weatherforecast.features.home.data.local.CitiesDao;
import com.example.weather.weatherforecast.features.home.data.local.WeathersDao;
import com.example.weather.weatherforecast.features.home.data.remote.WeatherApiService;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CitiesRepositoryImpl_Factory implements Factory<CitiesRepositoryImpl> {
  private final Provider<CitiesDao> citiesDaoProvider;

  private final Provider<WeathersDao> weathersDaoProvider;

  private final Provider<WeatherApiService> weatherApiServiceProvider;

  private final Provider<Context> contextProvider;

  public CitiesRepositoryImpl_Factory(Provider<CitiesDao> citiesDaoProvider,
      Provider<WeathersDao> weathersDaoProvider,
      Provider<WeatherApiService> weatherApiServiceProvider, Provider<Context> contextProvider) {
    this.citiesDaoProvider = citiesDaoProvider;
    this.weathersDaoProvider = weathersDaoProvider;
    this.weatherApiServiceProvider = weatherApiServiceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public CitiesRepositoryImpl get() {
    return newInstance(citiesDaoProvider.get(), weathersDaoProvider.get(), weatherApiServiceProvider.get(), contextProvider.get());
  }

  public static CitiesRepositoryImpl_Factory create(Provider<CitiesDao> citiesDaoProvider,
      Provider<WeathersDao> weathersDaoProvider,
      Provider<WeatherApiService> weatherApiServiceProvider, Provider<Context> contextProvider) {
    return new CitiesRepositoryImpl_Factory(citiesDaoProvider, weathersDaoProvider, weatherApiServiceProvider, contextProvider);
  }

  public static CitiesRepositoryImpl newInstance(CitiesDao citiesDao, WeathersDao weathersDao,
      WeatherApiService weatherApiService, Context context) {
    return new CitiesRepositoryImpl(citiesDao, weathersDao, weatherApiService, context);
  }
}
