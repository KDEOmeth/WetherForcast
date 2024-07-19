package com.example.weather.weatherforecast.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weather/weatherforecast/di/ViewModelModule;", "", "()V", "provideWeatherViewModel", "Landroidx/lifecycle/ViewModel;", "weatherViewModel", "Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.weather.weatherforecast.di.annotitions.ViewModelKey(value = com.example.weather.weatherforecast.features.home.ui.viewmodels.WeatherViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.ui.viewmodels.WeatherViewModel weatherViewModel);
    
    public ViewModelModule() {
        super();
    }
}