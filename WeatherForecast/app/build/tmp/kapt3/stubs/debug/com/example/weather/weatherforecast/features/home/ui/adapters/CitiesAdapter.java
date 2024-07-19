package com.example.weather.weatherforecast.features.home.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$SearchViewHolder;", "cityActionsListener", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$CityActionsListener;", "(Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$CityActionsListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CityActionsListener", "Companion", "SearchViewHolder", "app_debug"})
public final class CitiesAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.weather.weatherforecast.features.home.data.models.City, com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.SearchViewHolder> {
    private final com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.CityActionsListener cityActionsListener = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.weather.weatherforecast.features.home.data.models.City> callback = null;
    public static final com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.SearchViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.SearchViewHolder holder, int position) {
    }
    
    public CitiesAdapter(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.CityActionsListener cityActionsListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$SearchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/weather/weatherforecast/databinding/ItemCityBinding;", "(Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter;Lcom/example/weather/weatherforecast/databinding/ItemCityBinding;)V", "bind", "", "city", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "app_debug"})
    public final class SearchViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.weather.weatherforecast.databinding.ItemCityBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.features.home.data.models.City city) {
        }
        
        public SearchViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.databinding.ItemCityBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$CityActionsListener;", "", "onCityClick", "", "city", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "onUpdateCityFavorite", "app_debug"})
    public static abstract interface CityActionsListener {
        
        public abstract void onCityClick(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.features.home.data.models.City city);
        
        public abstract void onUpdateCityFavorite(@org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.features.home.data.models.City city);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$Companion;", "", "()V", "callback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}