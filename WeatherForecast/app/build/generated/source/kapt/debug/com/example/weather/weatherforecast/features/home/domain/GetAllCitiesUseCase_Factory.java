// Generated by Dagger (https://dagger.dev).
package com.example.weather.weatherforecast.features.home.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAllCitiesUseCase_Factory implements Factory<GetAllCitiesUseCase> {
  private final Provider<CitiesRepository> citiesRepositoryProvider;

  public GetAllCitiesUseCase_Factory(Provider<CitiesRepository> citiesRepositoryProvider) {
    this.citiesRepositoryProvider = citiesRepositoryProvider;
  }

  @Override
  public GetAllCitiesUseCase get() {
    return newInstance(citiesRepositoryProvider.get());
  }

  public static GetAllCitiesUseCase_Factory create(
      Provider<CitiesRepository> citiesRepositoryProvider) {
    return new GetAllCitiesUseCase_Factory(citiesRepositoryProvider);
  }

  public static GetAllCitiesUseCase newInstance(CitiesRepository citiesRepository) {
    return new GetAllCitiesUseCase(citiesRepository);
  }
}
