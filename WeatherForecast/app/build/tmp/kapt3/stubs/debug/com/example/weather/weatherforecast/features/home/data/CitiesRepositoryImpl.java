package com.example.weather.weatherforecast.features.home.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\"\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00170\u00132\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\u0011\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J%\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/CitiesRepositoryImpl;", "Lcom/example/weather/weatherforecast/features/home/domain/CitiesRepository;", "citiesDao", "Lcom/example/weather/weatherforecast/features/home/data/local/CitiesDao;", "weathersDao", "Lcom/example/weather/weatherforecast/features/home/data/local/WeathersDao;", "weatherApiService", "Lcom/example/weather/weatherforecast/features/home/data/remote/WeatherApiService;", "context", "Landroid/content/Context;", "(Lcom/example/weather/weatherforecast/features/home/data/local/CitiesDao;Lcom/example/weather/weatherforecast/features/home/data/local/WeathersDao;Lcom/example/weather/weatherforecast/features/home/data/remote/WeatherApiService;Landroid/content/Context;)V", "fetchLimiter", "Lcom/example/weather/weatherforecast/utils/result/FetchLimiter;", "", "getFetchLimiter", "()Lcom/example/weather/weatherforecast/utils/result/FetchLimiter;", "setFetchLimiter", "(Lcom/example/weather/weatherforecast/utils/result/FetchLimiter;)V", "getAllCities", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "getCityWeatherById", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "cityId", "getFavoriteCities", "populateCities", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchForCity", "query", "", "setDefaultCity", "cityName", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCity", "city", "(Lcom/example/weather/weatherforecast/features/home/data/models/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CitiesRepositoryImpl implements com.example.weather.weatherforecast.features.home.domain.CitiesRepository {
    @org.jetbrains.annotations.NotNull()
    private com.example.weather.weatherforecast.utils.result.FetchLimiter<? super java.lang.Integer> fetchLimiter;
    private final com.example.weather.weatherforecast.features.home.data.local.CitiesDao citiesDao = null;
    private final com.example.weather.weatherforecast.features.home.data.local.WeathersDao weathersDao = null;
    private final com.example.weather.weatherforecast.features.home.data.remote.WeatherApiService weatherApiService = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.utils.result.FetchLimiter<java.lang.Integer> getFetchLimiter() {
        return null;
    }
    
    public final void setFetchLimiter(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.result.FetchLimiter<? super java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object populateCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setDefaultCity(@org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateCity(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> getAllCities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> getFavoriteCities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> searchForCity(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.example.weather.weatherforecast.utils.result.Resource<java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData>>> getCityWeatherById(int cityId) {
        return null;
    }
    
    @javax.inject.Inject()
    public CitiesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.local.CitiesDao citiesDao, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.local.WeathersDao weathersDao, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.remote.WeatherApiService weatherApiService, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}