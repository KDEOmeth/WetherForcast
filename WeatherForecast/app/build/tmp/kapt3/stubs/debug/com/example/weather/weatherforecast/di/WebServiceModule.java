package com.example.weather.weatherforecast.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/weather/weatherforecast/di/WebServiceModule;", "", "()V", "buildRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "baseUrl", "", "provideMainRetrofit", "provideOkHttpClient", "provideWeatherApiService", "Lcom/example/weather/weatherforecast/features/home/data/remote/WeatherApiService;", "retrofit", "app_debug"})
@dagger.Module()
public final class WebServiceModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    private final retrofit2.Retrofit buildRetrofit(okhttp3.OkHttpClient okHttpClient, java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.weather.weatherforecast.di.annotitions.MainRetrofit()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideMainRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.weather.weatherforecast.features.home.data.remote.WeatherApiService provideWeatherApiService(@org.jetbrains.annotations.NotNull()
    @com.example.weather.weatherforecast.di.annotitions.MainRetrofit()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public WebServiceModule() {
        super();
    }
}