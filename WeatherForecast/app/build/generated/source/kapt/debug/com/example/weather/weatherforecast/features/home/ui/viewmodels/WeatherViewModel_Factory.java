// Generated by Dagger (https://dagger.dev).
package com.example.weather.weatherforecast.features.home.ui.viewmodels;

import com.example.weather.weatherforecast.features.home.domain.GetCityWeatherByIdUseCase;
import com.example.weather.weatherforecast.features.home.domain.GetFavoriteCitiesUseCase;
import com.example.weather.weatherforecast.features.home.domain.PopulateCitiesUseCase;
import com.example.weather.weatherforecast.features.home.domain.SearchForCityUseCase;
import com.example.weather.weatherforecast.features.home.domain.SetDefaultCityUseCase;
import com.example.weather.weatherforecast.features.home.domain.UpdateCityUseCase;
import com.example.weather.weatherforecast.utils.SessionManager;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<PopulateCitiesUseCase> populateCitiesUseCaseProvider;

  private final Provider<GetFavoriteCitiesUseCase> getFavoriteCitiesUseCaseProvider;

  private final Provider<UpdateCityUseCase> updateCityUseCaseProvider;

  private final Provider<SearchForCityUseCase> searchForCityUseCaseProvider;

  private final Provider<SetDefaultCityUseCase> setDefaultCityUseCaseProvider;

  private final Provider<GetCityWeatherByIdUseCase> getCityWeatherByIdUseCaseProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  public WeatherViewModel_Factory(Provider<PopulateCitiesUseCase> populateCitiesUseCaseProvider,
      Provider<GetFavoriteCitiesUseCase> getFavoriteCitiesUseCaseProvider,
      Provider<UpdateCityUseCase> updateCityUseCaseProvider,
      Provider<SearchForCityUseCase> searchForCityUseCaseProvider,
      Provider<SetDefaultCityUseCase> setDefaultCityUseCaseProvider,
      Provider<GetCityWeatherByIdUseCase> getCityWeatherByIdUseCaseProvider,
      Provider<SessionManager> sessionManagerProvider) {
    this.populateCitiesUseCaseProvider = populateCitiesUseCaseProvider;
    this.getFavoriteCitiesUseCaseProvider = getFavoriteCitiesUseCaseProvider;
    this.updateCityUseCaseProvider = updateCityUseCaseProvider;
    this.searchForCityUseCaseProvider = searchForCityUseCaseProvider;
    this.setDefaultCityUseCaseProvider = setDefaultCityUseCaseProvider;
    this.getCityWeatherByIdUseCaseProvider = getCityWeatherByIdUseCaseProvider;
    this.sessionManagerProvider = sessionManagerProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(populateCitiesUseCaseProvider.get(), getFavoriteCitiesUseCaseProvider.get(), updateCityUseCaseProvider.get(), searchForCityUseCaseProvider.get(), setDefaultCityUseCaseProvider.get(), getCityWeatherByIdUseCaseProvider.get(), sessionManagerProvider.get());
  }

  public static WeatherViewModel_Factory create(
      Provider<PopulateCitiesUseCase> populateCitiesUseCaseProvider,
      Provider<GetFavoriteCitiesUseCase> getFavoriteCitiesUseCaseProvider,
      Provider<UpdateCityUseCase> updateCityUseCaseProvider,
      Provider<SearchForCityUseCase> searchForCityUseCaseProvider,
      Provider<SetDefaultCityUseCase> setDefaultCityUseCaseProvider,
      Provider<GetCityWeatherByIdUseCase> getCityWeatherByIdUseCaseProvider,
      Provider<SessionManager> sessionManagerProvider) {
    return new WeatherViewModel_Factory(populateCitiesUseCaseProvider, getFavoriteCitiesUseCaseProvider, updateCityUseCaseProvider, searchForCityUseCaseProvider, setDefaultCityUseCaseProvider, getCityWeatherByIdUseCaseProvider, sessionManagerProvider);
  }

  public static WeatherViewModel newInstance(PopulateCitiesUseCase populateCitiesUseCase,
      GetFavoriteCitiesUseCase getFavoriteCitiesUseCase, UpdateCityUseCase updateCityUseCase,
      SearchForCityUseCase searchForCityUseCase, SetDefaultCityUseCase setDefaultCityUseCase,
      GetCityWeatherByIdUseCase getCityWeatherByIdUseCase, SessionManager sessionManager) {
    return new WeatherViewModel(populateCitiesUseCase, getFavoriteCitiesUseCase, updateCityUseCase, searchForCityUseCase, setDefaultCityUseCase, getCityWeatherByIdUseCase, sessionManager);
  }
}
