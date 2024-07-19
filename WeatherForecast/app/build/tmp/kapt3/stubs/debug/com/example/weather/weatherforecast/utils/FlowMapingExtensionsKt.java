package com.example.weather.weatherforecast.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u000725\b\u0001\u0010\b\u001a/\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u00a2\u0006\u0002\b\r\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a<\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a6\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"mappedLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "T", "tag", "", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "asMappedResourceLiveData", "Lkotlinx/coroutines/flow/Flow;", "asResourceLiveData", "app_debug"})
public final class FlowMapingExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<T>> asResourceLiveData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$asResourceLiveData, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<T>> asMappedResourceLiveData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.example.weather.weatherforecast.utils.result.Resource<T>> $this$asMappedResourceLiveData, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlin.experimental.ExperimentalTypeInference.class})
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.example.weather.weatherforecast.utils.result.Resource<T>> mappedLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, @org.jetbrains.annotations.NotNull()
    @kotlin.BuilderInference()
    kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<com.example.weather.weatherforecast.utils.result.Resource<T>>, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
        return null;
    }
}