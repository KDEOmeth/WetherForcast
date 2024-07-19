package com.example.weather.weatherforecast.features.home.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0002J\u001a\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u001f\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001dH\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\u0018\u00107\u001a\u00020\u00192\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00069"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/fragments/HomeFragment;", "Lcom/example/weather/weatherforecast/utils/views/BaseFragment;", "Lcom/example/weather/weatherforecast/databinding/FragmentHomeBinding;", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter$CityActionsListener;", "()V", "citiesAdapter", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter;", "getCitiesAdapter", "()Lcom/example/weather/weatherforecast/features/home/ui/adapters/CitiesAdapter;", "citiesAdapter$delegate", "Lkotlin/Lazy;", "searchView", "Landroidx/appcompat/widget/SearchView;", "viewModelFactory", "Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;)V", "weatherViewModel", "Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "getWeatherViewModel", "()Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "weatherViewModel$delegate", "handleFavoriteCitiesResult", "", "result", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "onBind", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCityClick", "city", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "onUpdateCityFavorite", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setError", "msg", "", "setLoading", "isLoading", "", "setObservers", "setupFavoriteCitiesRecyclerView", "submitFavoriteCityList", "list", "app_debug"})
public final class HomeFragment extends com.example.weather.weatherforecast.utils.views.BaseFragment<com.example.weather.weatherforecast.databinding.FragmentHomeBinding> implements com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter.CityActionsListener {
    private androidx.appcompat.widget.SearchView searchView;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory viewModelFactory;
    private final kotlin.Lazy weatherViewModel$delegate = null;
    private final kotlin.Lazy citiesAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory p0) {
    }
    
    private final com.example.weather.weatherforecast.features.home.ui.viewmodels.WeatherViewModel getWeatherViewModel() {
        return null;
    }
    
    private final com.example.weather.weatherforecast.features.home.ui.adapters.CitiesAdapter getCitiesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.weather.weatherforecast.databinding.FragmentHomeBinding onBind(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupFavoriteCitiesRecyclerView() {
    }
    
    private final void setObservers() {
    }
    
    private final void handleFavoriteCitiesResult(com.example.weather.weatherforecast.utils.result.Resource<java.util.List<com.example.weather.weatherforecast.features.home.data.models.City>> result) {
    }
    
    private final void setLoading(boolean isLoading) {
    }
    
    private final void setError(java.lang.String msg) {
    }
    
    private final void submitFavoriteCityList(java.util.List<com.example.weather.weatherforecast.features.home.data.models.City> list) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onCityClick(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
    }
    
    @java.lang.Override()
    public void onUpdateCityFavorite(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
    }
    
    public HomeFragment() {
        super();
    }
}