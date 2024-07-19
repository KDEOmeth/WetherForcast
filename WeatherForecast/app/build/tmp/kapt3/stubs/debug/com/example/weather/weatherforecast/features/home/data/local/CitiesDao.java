package com.example.weather.weatherforecast.features.home.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H\'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/local/CitiesDao;", "Lcom/example/weather/weatherforecast/utils/room/BaseDao;", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "()V", "getAllCities", "Lkotlinx/coroutines/flow/Flow;", "", "getFavoriteCities", "searchForCity", "query", "", "setDefaultCity", "", "cityName", "countryCode", "app_debug"})
public abstract class CitiesDao implements com.example.weather.weatherforecast.utils.room.BaseDao<com.example.weather.weatherforecast.features.home.data.models.City> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM city")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> getAllCities();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM city WHERE isFavorite = 1 LIMIT 5")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> getFavoriteCities();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM city WHERE name LIKE \'%\'||:query||\'%\' or state LIKE \'%\'||:query||\'%\' or country LIKE \'%\'||:query||\'%\' LIMIT 1000")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> searchForCity(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @androidx.room.Query(value = "UPDATE city SET isFavorite = 1 WHERE id = (SELECT id FROM city WHERE name LIKE \'%\'||:cityName||\'%\' and country LIKE \'%\'||:countryCode||\'%\' LIMIT 1)")
    public abstract int setDefaultCity(@org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode);
    
    public CitiesDao() {
        super();
    }
}