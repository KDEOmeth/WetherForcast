package com.example.weather.weatherforecast.features.home.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter$WeatherViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "WeatherViewHolder", "app_debug"})
public final class WeatherAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.weather.weatherforecast.features.home.data.models.WeatherData, com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter.WeatherViewHolder> {
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.weather.weatherforecast.features.home.data.models.WeatherData> callback = null;
    public static final com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter.WeatherViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter.WeatherViewHolder holder, int position) {
    }
    
    public WeatherAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter$WeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/weather/weatherforecast/databinding/ItemWeatherForecastBinding;", "(Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter;Lcom/example/weather/weatherforecast/databinding/ItemWeatherForecastBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "bindItem", "", "item", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "app_debug"})
    public final class WeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final kotlin.Lazy context$delegate = null;
        private final com.example.weather.weatherforecast.databinding.ItemWeatherForecastBinding binding = null;
        
        private final android.content.Context getContext() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.features.home.data.models.WeatherData item) {
        }
        
        public WeatherViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.databinding.ItemWeatherForecastBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter$Companion;", "", "()V", "callback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}