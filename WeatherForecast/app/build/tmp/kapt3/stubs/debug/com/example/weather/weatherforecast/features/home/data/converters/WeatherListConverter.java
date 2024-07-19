package com.example.weather.weatherforecast.features.home.data.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/converters/WeatherListConverter;", "", "()V", "type", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "toJson", "", "obj", "", "Lcom/example/weather/weatherforecast/features/home/data/models/Weather;", "toList", "json", "app_debug"})
public final class WeatherListConverter {
    private final java.lang.reflect.Type type = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toJson(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.weatherforecast.features.home.data.models.Weather> obj) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.example.weather.weatherforecast.features.home.data.models.Weather> toList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    public WeatherListConverter() {
        super();
    }
}