package com.example.weather.weatherforecast.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0010J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"Lcom/example/weather/weatherforecast/di/AppComponent;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "inject", "", "mainActivity", "Lcom/example/weather/weatherforecast/features/home/ui/activities/MainActivity;", "cityWeatherFragment", "Lcom/example/weather/weatherforecast/features/home/ui/fragments/CityWeatherFragment;", "homeFragment", "Lcom/example/weather/weatherforecast/features/home/ui/fragments/HomeFragment;", "searchCityFragment", "Lcom/example/weather/weatherforecast/features/home/ui/fragments/SearchCityFragment;", "Factory", "app_debug"})
@dagger.Component(modules = {com.example.weather.weatherforecast.di.ContextModule.class, com.example.weather.weatherforecast.di.ViewModelModule.class, com.example.weather.weatherforecast.di.RepositoriesModule.class, com.example.weather.weatherforecast.di.RoomModule.class, com.example.weather.weatherforecast.di.WebServiceModule.class, com.example.weather.weatherforecast.di.PrefsModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void inject(@org.jetbrains.annotations.Nullable()
    com.example.weather.weatherforecast.features.home.ui.activities.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.Nullable()
    com.example.weather.weatherforecast.features.home.ui.fragments.HomeFragment homeFragment);
    
    public abstract void inject(@org.jetbrains.annotations.Nullable()
    com.example.weather.weatherforecast.features.home.ui.fragments.CityWeatherFragment cityWeatherFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.ui.fragments.SearchCityFragment searchCityFragment);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/weather/weatherforecast/di/AppComponent$Factory;", "", "create", "Lcom/example/weather/weatherforecast/di/AppComponent;", "contextModule", "Lcom/example/weather/weatherforecast/di/ContextModule;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.weather.weatherforecast.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.di.ContextModule contextModule);
    }
}