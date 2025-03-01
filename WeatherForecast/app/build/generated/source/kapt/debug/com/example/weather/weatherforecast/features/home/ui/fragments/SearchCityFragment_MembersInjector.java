// Generated by Dagger (https://dagger.dev).
package com.example.weather.weatherforecast.features.home.ui.fragments;

import com.example.weather.weatherforecast.utils.viewmodel.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchCityFragment_MembersInjector implements MembersInjector<SearchCityFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public SearchCityFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SearchCityFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new SearchCityFragment_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(SearchCityFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.weather.weatherforecast.features.home.ui.fragments.SearchCityFragment.viewModelFactory")
  public static void injectViewModelFactory(SearchCityFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
