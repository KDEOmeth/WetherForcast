package com.example.weather.weatherforecast.features.home.data.models;

import java.lang.System;

@androidx.annotation.Keep()
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\fH\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/example/weather/weatherforecast/features/home/data/models/GetWeatherResponse;", "Landroid/os/Parcelable;", "cod", "", "message", "", "cnt", "", "weatherDataList", "", "Lcom/example/weather/weatherforecast/features/home/data/models/WeatherData;", "city", "Lcom/example/weather/weatherforecast/features/home/data/models/City;", "(Ljava/lang/String;DILjava/util/List;Lcom/example/weather/weatherforecast/features/home/data/models/City;)V", "getCity", "()Lcom/example/weather/weatherforecast/features/home/data/models/City;", "getCnt", "()I", "getCod", "()Ljava/lang/String;", "getMessage", "()D", "getWeatherDataList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class GetWeatherResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cod")
    private final java.lang.String cod = null;
    @com.google.gson.annotations.SerializedName(value = "message")
    private final double message = 0.0;
    @com.google.gson.annotations.SerializedName(value = "cnt")
    private final int cnt = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "list")
    private final java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> weatherDataList = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.example.weather.weatherforecast.features.home.data.models.City city = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCod() {
        return null;
    }
    
    public final double getMessage() {
        return 0.0;
    }
    
    public final int getCnt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> getWeatherDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.features.home.data.models.City getCity() {
        return null;
    }
    
    public GetWeatherResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String cod, double message, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> weatherDataList, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.features.home.data.models.City component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.features.home.data.models.GetWeatherResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String cod, double message, int cnt, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weather.weatherforecast.features.home.data.models.WeatherData> weatherDataList, @org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.features.home.data.models.City city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}