package com.example.weather.weatherforecast.features.home.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0003J\u0016\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&H\u0002J\u0016\u0010\'\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&H\u0002J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\"H\u0002J\u001c\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\nH\u0002J\b\u00101\u001a\u00020\"H\u0002J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020,H\u0002J\u001c\u00104\u001a\u00020\"2\u0006\u00103\u001a\u00020,2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\nH\u0002J\b\u00106\u001a\u00020\"H\u0002J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\nH\u0002J\u0010\u00109\u001a\u00020\"2\u0006\u00108\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006:"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/ui/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/weather/weatherforecast/databinding/ActivityMainBinding;", "navController", "Landroidx/navigation/NavController;", "requestLocationPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "getRequestLocationPermissionLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "requestLocationPermissionLauncher$delegate", "Lkotlin/Lazy;", "sessionManager", "Lcom/example/weather/weatherforecast/utils/SessionManager;", "getSessionManager", "()Lcom/example/weather/weatherforecast/utils/SessionManager;", "setSessionManager", "(Lcom/example/weather/weatherforecast/utils/SessionManager;)V", "viewModelFactory", "Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/weather/weatherforecast/utils/viewmodel/ViewModelFactory;)V", "weatherViewModel", "Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "getWeatherViewModel", "()Lcom/example/weather/weatherforecast/features/home/ui/viewmodels/WeatherViewModel;", "weatherViewModel$delegate", "checkLocationPermission", "", "getCurrentLocation", "handleDefaultCityResult", "result", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "handlePopulateFirstTimeResult", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "populateCitiesFistTime", "setDefaultCity", "cityName", "countryCode", "setDefaultCityLondonUK", "setLoading", "isLoading", "setPopulateCitiesLoading", "message", "setupNavigationComponent", "showError", "msg", "showPopulateCitiesError", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.weather.weatherforecast.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.weather.weatherforecast.utils.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory viewModelFactory;
    private final kotlin.Lazy weatherViewModel$delegate = null;
    private androidx.navigation.NavController navController;
    private final kotlin.Lazy requestLocationPermissionLauncher$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.utils.SessionManager getSessionManager() {
        return null;
    }
    
    public final void setSessionManager(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.SessionManager p0) {
    }
    
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
    
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> getRequestLocationPermissionLauncher() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupNavigationComponent() {
    }
    
    private final void populateCitiesFistTime() {
    }
    
    private final void handlePopulateFirstTimeResult(com.example.weather.weatherforecast.utils.result.Resource<kotlin.Unit> result) {
    }
    
    private final void setPopulateCitiesLoading(boolean isLoading, java.lang.String message) {
    }
    
    private final void showPopulateCitiesError(java.lang.String msg) {
    }
    
    private final void checkLocationPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getCurrentLocation() {
    }
    
    private final void setDefaultCityLondonUK() {
    }
    
    private final void setDefaultCity(java.lang.String cityName, java.lang.String countryCode) {
    }
    
    private final void handleDefaultCityResult(com.example.weather.weatherforecast.utils.result.Resource<kotlin.Unit> result) {
    }
    
    private final void setLoading(boolean isLoading) {
    }
    
    private final void showError(java.lang.String msg) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}