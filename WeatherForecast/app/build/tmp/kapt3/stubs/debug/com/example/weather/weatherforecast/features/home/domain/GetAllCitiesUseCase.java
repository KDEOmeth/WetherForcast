package com.example.weather.weatherforecast.features.home.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/domain/GetAllCitiesUseCase;", "", "citiesRepository", "Lcom/example/weather/weatherforecast/features/home/domain/CitiesRepository;", "(Lcom/example/weather/weatherforecast/features/home/domain/CitiesRepository;)V", "get", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "app_debug"})
public final class GetAllCitiesUseCase {
    private final com.example.weather.weatherforecast.features.home.domain.CitiesRepository citiesRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> get() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetAllCitiesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.domain.CitiesRepository citiesRepository) {
        super();
    }
}