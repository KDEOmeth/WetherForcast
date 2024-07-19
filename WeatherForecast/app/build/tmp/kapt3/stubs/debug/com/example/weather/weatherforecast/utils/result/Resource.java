package com.example.weather.weatherforecast.utils.result;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nR$\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weather/weatherforecast/utils/result/Resource;", "T", "", "resourceType", "Lcom/example/weather/weatherforecast/utils/result/ResourceType;", "data", "message", "", "(Lcom/example/weather/weatherforecast/utils/result/ResourceType;Ljava/lang/Object;Ljava/lang/String;)V", "(Lcom/example/weather/weatherforecast/utils/result/ResourceType;Ljava/lang/Object;)V", "(Lcom/example/weather/weatherforecast/utils/result/ResourceType;Ljava/lang/String;)V", "<set-?>", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getResourceType", "()Lcom/example/weather/weatherforecast/utils/result/ResourceType;", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.weather.weatherforecast.utils.result.ResourceType resourceType = null;
    @org.jetbrains.annotations.Nullable()
    private T data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    public static final com.example.weather.weatherforecast.utils.result.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weather.weatherforecast.utils.result.ResourceType getResourceType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.result.ResourceType resourceType, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.result.ResourceType resourceType, @org.jetbrains.annotations.Nullable()
    T data) {
        super();
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.example.weather.weatherforecast.utils.result.ResourceType resourceType, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ)\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/weather/weatherforecast/utils/result/Resource$Companion;", "", "()V", "authFailedError", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "T", "data", "(Ljava/lang/Object;)Lcom/example/weather/weatherforecast/utils/result/Resource;", "connectionError", "emptyDataError", "error", "message", "", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/example/weather/weatherforecast/utils/result/Resource;", "loading", "success", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/example/weather/weatherforecast/utils/result/Resource;", "successMessage", "validationError", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> success() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> success(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> success(T data, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> successMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> error(@org.jetbrains.annotations.Nullable()
        java.lang.String message, T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> error(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> error(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> error() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> connectionError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> emptyDataError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> validationError(T data, @org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> validationError(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> authFailedError(T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> authFailedError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> loading() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.weather.weatherforecast.utils.result.Resource<T> loading(T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}