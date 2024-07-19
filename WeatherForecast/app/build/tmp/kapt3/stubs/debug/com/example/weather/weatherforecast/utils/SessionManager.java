package com.example.weather.weatherforecast.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weather/weatherforecast/utils/SessionManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "editor", "Landroid/content/SharedPreferences$Editor;", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;)V", "canRequestLocation", "", "getCanRequestLocation", "()Z", "setCanRequestLocation", "(Z)V", "isFistTime", "shouldPopulateCities", "getShouldPopulateCities", "setShouldPopulateCities", "clearData", "", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class SessionManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.Editor editor = null;
    private static final java.lang.String SHOULD_POPULATE_CITIES = "should_populate_cities";
    private static final java.lang.String CAN_REQUEST_LOCATION = "can_request_location";
    public static final com.example.weather.weatherforecast.utils.SessionManager.Companion Companion = null;
    
    public final boolean getShouldPopulateCities() {
        return false;
    }
    
    public final void setShouldPopulateCities(boolean isFistTime) {
    }
    
    public final boolean getCanRequestLocation() {
        return false;
    }
    
    public final void setCanRequestLocation(boolean canRequestLocation) {
    }
    
    public final void clearData() {
    }
    
    @javax.inject.Inject()
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/weather/weatherforecast/utils/SessionManager$Companion;", "", "()V", "CAN_REQUEST_LOCATION", "", "SHOULD_POPULATE_CITIES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}