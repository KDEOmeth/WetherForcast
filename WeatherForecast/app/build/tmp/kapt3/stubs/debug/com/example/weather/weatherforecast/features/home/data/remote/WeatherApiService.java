package com.example.weather.weatherforecast.features.home.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/remote/WeatherApiService;", "", "getCityWeather", "Lcom/example/weather/weatherforecast/features/home/data/models/GetWeatherResponse;", "cityId", "", "latitude", "", "longitude", "units", "", "appKey", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "data/2.5/forecast")
    public abstract java.lang.Object getCityWeather(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.Integer cityId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "lat")
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "lon")
    java.lang.Double longitude, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String appKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weather.weatherforecast.features.home.data.models.GetWeatherResponse> p5);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}