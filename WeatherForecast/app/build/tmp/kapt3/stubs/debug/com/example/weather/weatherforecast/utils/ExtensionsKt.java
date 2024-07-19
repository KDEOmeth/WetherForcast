package com.example.weather.weatherforecast.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001aD\u0010\u0015\u001a\u00020\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\u001c\u0010\u001a\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u001a\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f*\u00020 \u001a\"\u0010!\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a\"\u0010%\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a*\u0010%\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0019H\u0086\b\u00a2\u0006\u0002\u0010\'\u001a\"\u0010(\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a\"\u0010)\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a\"\u0010*\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a\"\u0010+\u001a\u00020\"\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00022\u0006\u0010#\u001a\u00020\u0001H\u0086\b\u00a2\u0006\u0002\u0010$\u001a+\u0010,\u001a\u00020\u0016\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010/H\u0086\b\u001a\f\u00100\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0002H\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"TAG", "", "T", "getTAG", "(Ljava/lang/Object;)Ljava/lang/String;", "app", "Lcom/example/weather/weatherforecast/App;", "Landroid/content/Context;", "getApp", "(Landroid/content/Context;)Lcom/example/weather/weatherforecast/App;", "appComponent", "Lcom/example/weather/weatherforecast/di/AppComponent;", "getAppComponent", "(Landroid/content/Context;)Lcom/example/weather/weatherforecast/di/AppComponent;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Lcom/example/weather/weatherforecast/di/AppComponent;", "layoutInflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "getLayoutInflater", "(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "call", "", "onError", "Lkotlin/Function1;", "", "action", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getQueryTextChangeStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/appcompat/widget/SearchView;", "logd", "", "message", "(Ljava/lang/Object;Ljava/lang/String;)I", "loge", "throwable", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)I", "logi", "logv", "logw", "logwtf", "submitList", "Landroid/widget/ArrayAdapter;", "list", "", "toReadableDateTime", "app_debug"})
public final class ExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather.weatherforecast.App getApp(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather.weatherforecast.di.AppComponent getAppComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$appComponent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weather.weatherforecast.di.AppComponent getAppComponent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$appComponent) {
        return null;
    }
    
    /**
     * convert search view text change to flow
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.flow.StateFlow<java.lang.String> getQueryTextChangeStateFlow(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.SearchView $this$getQueryTextChangeStateFlow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.LayoutInflater getLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$layoutInflater) {
        return null;
    }
    
    public static final void call(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    /**
     * Format date-time info readable day-date-time
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toReadableDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toReadableDateTime) {
        return null;
    }
}