package com.example.weather.weatherforecast.features.home.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u001e\u0010\u001f\u001a\u00020\u001e2\u0014\u0010 \u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0002J\u001a\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0018\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\b\u00106\u001a\u00020\u001eH\u0002J\u0018\u00107\u001a\u00020\u001e2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006:"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/fragments/CityWeatherFragment;", "Lcom/example/weather/weatherforecast/utils/views/BaseFragment;", "Lcom/example/weather/weatherforecast/databinding/FragmentCityWeatherBinding;", "()V", "args", "Lcom/example/weather/weatherforecast/features/home/ui/fragments/CityWeatherFragmentArgs;", "getArgs", "()Lcom/example/weather/weatherforecast/features/home/ui/fragments/CityWeatherFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "checkBoxFavorite", "Landroidx/appcompat/widget/AppCompatCheckBox;", "viewModelFactory", "Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;)V", "weatherAdapter", "Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter;", "getWeatherAdapter", "()Lcom/example/weather/weatherforecast/features/home/ui/adapters/WeatherAdapter;", "weatherAdapter$delegate", "Lkotlin/Lazy;", "weatherViewModel", "Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "getWeatherViewModel", "()Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "weatherViewModel$delegate", "getCityWeatherForecast", "", "handleWeatherListResult", "result", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "onBind", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setLoading", "isLoading", "", "setupWeatherRecyclerView", "showError", "submitWeatherList", "list", "Companion", "app_debug"})
public final class CityWeatherFragment extends com.example.weather.weatherforecast.utils.views.BaseFragment<com.example.weather.weatherforecast.databinding.FragmentCityWeatherBinding> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory viewModelFactory;
    private final kotlin.Lazy weatherViewModel$delegate = null;
    private androidx.appcompat.widget.AppCompatCheckBox checkBoxFavorite;
    private final kotlin.Lazy weatherAdapter$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    public static final com.example.weather.weatherforecast.features.home.ui.fragments.CityWeatherFragment.Companion Companion = null;
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
    
    private final com.example.weather.weatherforecast.features.home.ui.adapters.WeatherAdapter getWeatherAdapter() {
        return null;
    }
    
    private final com.example.weather.weatherforecast.features.home.ui.fragments.CityWeatherFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.weather.weatherforecast.databinding.FragmentCityWeatherBinding onBind(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupWeatherRecyclerView() {
    }
    
    private final void getCityWeatherForecast() {
    }
    
    private final void handleWeatherListResult(com.example.weather.weatherforecast.utils.result.Resource<? extends java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData>> result) {
    }
    
    private final void setLoading(boolean isLoading) {
    }
    
    private final void submitWeatherList(java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> list) {
    }
    
    private final void showError() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public CityWeatherFragment() {
        super();
    }
    
    public static final void show(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/fragments/CityWeatherFragment$Companion;", "", "()V", "show", "", "navController", "Landroidx/navigation/NavController;", "city", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
        com.example.weather.weatherforecast.features.home.data.models.City city) {
        }
        
        private Companion() {
            super();
        }
    }
}