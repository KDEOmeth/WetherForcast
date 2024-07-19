package com.example.weather.weatherforecast.features.home.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.weather.weatherforecast.features.home.data.models.City
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class CityWeatherFragmentArgs(
  val city: City
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): CityWeatherFragmentArgs {
      bundle.setClassLoader(CityWeatherFragmentArgs::class.java.classLoader)
      val __city : City?
      if (bundle.containsKey("city")) {
        if (Parcelable::class.java.isAssignableFrom(City::class.java) ||
            Serializable::class.java.isAssignableFrom(City::class.java)) {
          __city = bundle.get("city") as City?
        } else {
          throw UnsupportedOperationException(City::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__city == null) {
          throw IllegalArgumentException("Argument \"city\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"city\" is missing and does not have an android:defaultValue")
      }
      return CityWeatherFragmentArgs(__city)
    }
  }
}
