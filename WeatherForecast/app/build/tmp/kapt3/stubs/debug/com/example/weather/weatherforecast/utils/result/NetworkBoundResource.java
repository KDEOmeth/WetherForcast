package com.example.weather.weatherforecast.utils.result;

import java.lang.System;

/**
 * A generic class that can provide a resource backed by both the room database and the network.
 *
 * You can read more about it in the [Architecture
 * * Guide](https://developer.android.com/arch).
 * @param <ResourceType></ResourceType>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006J\u0011\u0010\b\u001a\u00028\u0001H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H%J\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H%\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/weather/weatherforecast/utils/result/NetworkBoundResource;", "ResourceType", "ResponseType", "", "()V", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/weather/weatherforecast/utils/result/Resource;", "fetchFromNetwork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromDb", "mapLocalData", "resourceType", "(Ljava/lang/Object;)Ljava/lang/Object;", "onFetchFailed", "", "saveNetworkResult", "response", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResourceType extends java.lang.Object, ResponseType extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.weather.weatherforecast.utils.result.Resource<ResourceType>> asFlow() {
        return null;
    }
    
    protected void onFetchFailed() {
    }
    
    public ResourceType mapLocalData(ResourceType resourceType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    protected abstract java.lang.Object fetchFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ResponseType> p0);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract kotlinx.coroutines.flow.Flow<ResourceType> loadFromDb();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object saveNetworkResult(ResponseType response, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(ResourceType data);
    
    public NetworkBoundResource() {
        super();
    }
}