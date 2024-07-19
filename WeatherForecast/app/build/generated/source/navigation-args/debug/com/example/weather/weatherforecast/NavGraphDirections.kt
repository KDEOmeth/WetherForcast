package com.example.weather.weatherforecast

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.weather.weatherforecast.features.home.data.models.City
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class NavGraphDirections private constructor() {
  private data class ActionNavigateToCityWeatherFragment(
    val city: City
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_navigate_to_cityWeatherFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(City::class.java)) {
        result.putParcelable("city", this.city as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(City::class.java)) {
        result.putSerializable("city", this.city as Serializable)
      } else {
        throw UnsupportedOperationException(City::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionNavigateToSearchCityFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_navigate_to_searchCityFragment)

    fun actionNavigateToCityWeatherFragment(city: City): NavDirections =
        ActionNavigateToCityWeatherFragment(city)
  }
}
