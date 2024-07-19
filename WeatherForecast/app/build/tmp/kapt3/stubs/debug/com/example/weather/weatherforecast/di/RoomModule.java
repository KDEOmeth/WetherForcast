package com.example.weather.weatherforecast.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/weather/weatherforecast/di/RoomModule;", "", "()V", "providePatientsDao", "Lcom/example/weather/weatherforecast/features/home/data/local/CitiesDao;", "db", "Lcom/example/weather/weatherforecast/utils/db/MainRoomDatabase;", "provideWeathersDao", "Lcom/example/weather/weatherforecast/features/home/data/local/WeathersDao;", "providesRoomDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.weather.weatherforecast.utils.db.MainRoomDatabase providesRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.weather.weatherforecast.features.home.data.local.CitiesDao providePatientsDao(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.db.MainRoomDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.weather.weatherforecast.features.home.data.local.WeathersDao provideWeathersDao(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.db.MainRoomDatabase db) {
        return null;
    }
    
    public RoomModule() {
        super();
    }
}