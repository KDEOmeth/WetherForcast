// Generated by Dagger (https://dagger.dev).
package com.example.weather.weatherforecast.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContextModule_ProvideContextFactory implements Factory<Context> {
  private final ContextModule module;

  public ContextModule_ProvideContextFactory(ContextModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ContextModule_ProvideContextFactory create(ContextModule module) {
    return new ContextModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ContextModule instance) {
    return Preconditions.checkNotNull(instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
