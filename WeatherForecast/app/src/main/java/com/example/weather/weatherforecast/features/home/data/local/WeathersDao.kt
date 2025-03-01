package com.example.weather.weatherforecast.features.home.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.weather.weatherforecast.features.home.data.models.WeatherData
import com.example.weather.weatherforecast.utils.room.BaseDao
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WeathersDao : BaseDao<WeatherData> {
  @Query("SELECT * FROM weatherdata WHERE city_owner_id IN(:cityId)")
  abstract fun getWeathersByCityId(cityId: Int): Flow<List<WeatherData>>

  @Transaction
  open suspend fun updateList(cityId: Int, list: List<WeatherData>) {
    deleteAll(cityId)
    insert(list)
  }

  @Query("DELETE FROM weatherdata WHERE city_owner_id IN(:cityId)")
  abstract suspend fun deleteAll(cityId: Int)
}