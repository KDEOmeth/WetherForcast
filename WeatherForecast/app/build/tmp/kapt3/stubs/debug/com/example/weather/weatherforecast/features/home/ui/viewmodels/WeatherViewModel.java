package com.example.weather.weatherforecast.features.home.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00130\u0012J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u0012J \u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00130\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0019R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "populateCitiesUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/PopulateCitiesUseCase;", "getFavoriteCitiesUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/GetFavoriteCitiesUseCase;", "updateCityUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/UpdateCityUseCase;", "searchForCityUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/SearchForCityUseCase;", "setDefaultCityUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/SetDefaultCityUseCase;", "getCityWeatherByIdUseCase", "Lcom/example/weather/weatherforecast/features/home/domain/GetCityWeatherByIdUseCase;", "sessionManager", "Lcom/example/weather/weatherforecast/utils/SessionManager;", "(Lcom/example/weather/weatherforecast/features/home/domain/PopulateCitiesUseCase;Lcom/example/weather/weatherforecast/features/home/domain/GetFavoriteCitiesUseCase;Lcom/example/weather/weatherforecast/features/home/domain/UpdateCityUseCase;Lcom/example/weather/weatherforecast/features/home/domain/SearchForCityUseCase;Lcom/example/weather/weatherforecast/features/home/domain/SetDefaultCityUseCase;Lcom/example/weather/weatherforecast/features/home/domain/GetCityWeatherByIdUseCase;Lcom/example/weather/weatherforecast/utils/SessionManager;)V", "getCityWeatherForecast", "Landroidx/lifecycle/LiveData;", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "cityId", "", "getFavoriteCities", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "populateCitiesFistTime", "", "searchForCity", "query", "", "setDefaultCity", "cityName", "countryCode", "updateCity", "city", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.weather.weatherforecast.features.home.domain.PopulateCitiesUseCase populateCitiesUseCase = null;
    private final com.example.weather.weatherforecast.features.home.domain.GetFavoriteCitiesUseCase getFavoriteCitiesUseCase = null;
    private final com.example.weather.weatherforecast.features.home.domain.UpdateCityUseCase updateCityUseCase = null;
    private final com.example.weather.weatherforecast.features.home.domain.SearchForCityUseCase searchForCityUseCase = null;
    private final com.example.weather.weatherforecast.features.home.domain.SetDefaultCityUseCase setDefaultCityUseCase = null;
    private final com.example.weather.weatherforecast.features.home.domain.GetCityWeatherByIdUseCase getCityWeatherByIdUseCase = null;
    private final com.example.weather.weatherforecast.utils.SessionManager sessionManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<kotlin.Unit>> populateCitiesFistTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>>> getFavoriteCities() {
        return null;
    }
    
    public final void updateCity(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>>> searchForCity(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<kotlin.Unit>> setDefaultCity(@org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public final androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData>>> getCityWeatherForecast(int cityId) {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.PopulateCitiesUseCase populateCitiesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.GetFavoriteCitiesUseCase getFavoriteCitiesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.UpdateCityUseCase updateCityUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.SearchForCityUseCase searchForCityUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.SetDefaultCityUseCase setDefaultCityUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.GetCityWeatherByIdUseCase getCityWeatherByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.SessionManager sessionManager) {
        super();
    }
}