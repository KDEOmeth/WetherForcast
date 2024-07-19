package com.example.weather.weatherforecast.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weather/weatherforecast/di/RepositoriesModule;", "", "()V", "bindCitiesRepository", "Lcom/example/weather/weatherforecast/features/home/domain/CitiesRepository;", "citiesRepository", "Lcom/example/weather/weatherforecast/features/home/data/CitiesRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class RepositoriesModule {
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.example.weather.weatherforecast.features.home.domain.CitiesRepository bindCitiesRepository(@org.jetbrains.annotations.Nullable()
    com.example.weather.weatherforecast.features.home.data.CitiesRepositoryImpl citiesRepository);
    
    public RepositoriesModule() {
        super();
    }
}