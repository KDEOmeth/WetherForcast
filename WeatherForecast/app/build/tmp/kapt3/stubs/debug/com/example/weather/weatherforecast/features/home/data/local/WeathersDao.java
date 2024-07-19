package com.example.weather.weatherforecast.features.home.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/local/WeathersDao;", "Lcom/example/weather/weatherforecast/utils/room/BaseDao;", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "()V", "deleteAll", "", "cityId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeathersByCityId", "Lkotlinx/coroutines/flow/Flow;", "", "updateList", "list", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class WeathersDao implements com.example.weather.weatherforecast.utils.room.BaseDao<com.example.weather.weatherforecast.features.home.data.models.WeatherData> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM weatherdata WHERE city_owner_id IN(:cityId)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData>> getWeathersByCityId(int cityId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public java.lang.Object updateList(int p0, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> p1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM weatherdata WHERE city_owner_id IN(:cityId)")
    public abstract java.lang.Object deleteAll(int cityId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    public WeathersDao() {
        super();
    }
}