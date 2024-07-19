package com.example.weather.weatherforecast.utils.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.weather.weatherforecast.features.home.data.converters.WeatherListConverter.class})
@androidx.room.Database(entities = {com.example.weather.weatherforecast.features.home.data.models.City.class, com.example.weather.weatherforecast.features.home.data.models.WeatherData.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weather/weatherforecast/utils/db/MainRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "citiesDao", "Lcom/example/weather/weatherforecast/features/home/data/local/CitiesDao;", "weathersDao", "Lcom/example/weather/weatherforecast/features/home/data/local/WeathersDao;", "app_debug"})
public abstract class MainRoomDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weather.weatherforecast.features.home.data.local.CitiesDao citiesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.weather.weatherforecast.features.home.data.local.WeathersDao weathersDao();
    
    public MainRoomDatabase() {
        super();
    }
}