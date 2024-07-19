package com.example.weather.weatherforecast.features.home.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weather.weatherforecast.features.home.data.converters.WeatherListConverter;
import com.example.weather.weatherforecast.features.home.data.models.Main;
import com.example.weather.weatherforecast.features.home.data.models.Weather;
import com.example.weather.weatherforecast.features.home.data.models.WeatherData;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeathersDao_Impl extends WeathersDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherData> __insertionAdapterOfWeatherData;

  private final WeatherListConverter __weatherListConverter = new WeatherListConverter();

  private final EntityDeletionOrUpdateAdapter<WeatherData> __deletionAdapterOfWeatherData;

  private final EntityDeletionOrUpdateAdapter<WeatherData> __updateAdapterOfWeatherData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public WeathersDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherData = new EntityInsertionAdapter<WeatherData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WeatherData` (`id`,`city_owner_id`,`weatherList`,`date`,`temp`,`tempMin`,`tempMax`,`pressure`,`seaLevel`,`grndLevel`,`humidity`,`tempKf`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherData value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCityOwnerId());
        final String _tmp;
        _tmp = __weatherListConverter.toJson(value.getWeatherList());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        final Main _tmpMain = value.getMain();
        if(_tmpMain != null) {
          stmt.bindDouble(5, _tmpMain.getTemp());
          stmt.bindDouble(6, _tmpMain.getTempMin());
          stmt.bindDouble(7, _tmpMain.getTempMax());
          stmt.bindDouble(8, _tmpMain.getPressure());
          stmt.bindDouble(9, _tmpMain.getSeaLevel());
          stmt.bindDouble(10, _tmpMain.getGrndLevel());
          stmt.bindLong(11, _tmpMain.getHumidity());
          stmt.bindDouble(12, _tmpMain.getTempKf());
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
      }
    };
    this.__deletionAdapterOfWeatherData = new EntityDeletionOrUpdateAdapter<WeatherData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WeatherData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfWeatherData = new EntityDeletionOrUpdateAdapter<WeatherData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `WeatherData` SET `id` = ?,`city_owner_id` = ?,`weatherList` = ?,`date` = ?,`temp` = ?,`tempMin` = ?,`tempMax` = ?,`pressure` = ?,`seaLevel` = ?,`grndLevel` = ?,`humidity` = ?,`tempKf` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherData value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCityOwnerId());
        final String _tmp;
        _tmp = __weatherListConverter.toJson(value.getWeatherList());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        final Main _tmpMain = value.getMain();
        if(_tmpMain != null) {
          stmt.bindDouble(5, _tmpMain.getTemp());
          stmt.bindDouble(6, _tmpMain.getTempMin());
          stmt.bindDouble(7, _tmpMain.getTempMax());
          stmt.bindDouble(8, _tmpMain.getPressure());
          stmt.bindDouble(9, _tmpMain.getSeaLevel());
          stmt.bindDouble(10, _tmpMain.getGrndLevel());
          stmt.bindLong(11, _tmpMain.getHumidity());
          stmt.bindDouble(12, _tmpMain.getTempKf());
        } else {
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
        stmt.bindLong(13, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM weatherdata WHERE city_owner_id IN(?)";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final WeatherData item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWeatherData.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<? extends WeatherData> itemList,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWeatherData.insert(itemList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final WeatherData item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWeatherData.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final WeatherData item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfWeatherData.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateList(final int p0, final List<WeatherData> p1,
      final Continuation<? super Unit> p2) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return WeathersDao_Impl.super.updateList(p0, p1, __cont);
      }
    }, p2);
  }

  @Override
  public Object deleteAll(final int cityId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, cityId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<WeatherData>> getWeathersByCityId(final int cityId) {
    final String _sql = "SELECT * FROM weatherdata WHERE city_owner_id IN(?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, cityId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"weatherdata"}, new Callable<List<WeatherData>>() {
      @Override
      public List<WeatherData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityOwnerId = CursorUtil.getColumnIndexOrThrow(_cursor, "city_owner_id");
          final int _cursorIndexOfWeatherList = CursorUtil.getColumnIndexOrThrow(_cursor, "weatherList");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
          final int _cursorIndexOfTempMin = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMin");
          final int _cursorIndexOfTempMax = CursorUtil.getColumnIndexOrThrow(_cursor, "tempMax");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfSeaLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "seaLevel");
          final int _cursorIndexOfGrndLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "grndLevel");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfTempKf = CursorUtil.getColumnIndexOrThrow(_cursor, "tempKf");
          final List<WeatherData> _result = new ArrayList<WeatherData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WeatherData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpCityOwnerId;
            _tmpCityOwnerId = _cursor.getInt(_cursorIndexOfCityOwnerId);
            final List<Weather> _tmpWeatherList;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfWeatherList);
            _tmpWeatherList = __weatherListConverter.toList(_tmp);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final Main _tmpMain;
            if (! (_cursor.isNull(_cursorIndexOfTemp) && _cursor.isNull(_cursorIndexOfTempMin) && _cursor.isNull(_cursorIndexOfTempMax) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfSeaLevel) && _cursor.isNull(_cursorIndexOfGrndLevel) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfTempKf))) {
              final double _tmpTemp;
              _tmpTemp = _cursor.getDouble(_cursorIndexOfTemp);
              final double _tmpTempMin;
              _tmpTempMin = _cursor.getDouble(_cursorIndexOfTempMin);
              final double _tmpTempMax;
              _tmpTempMax = _cursor.getDouble(_cursorIndexOfTempMax);
              final double _tmpPressure;
              _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
              final double _tmpSeaLevel;
              _tmpSeaLevel = _cursor.getDouble(_cursorIndexOfSeaLevel);
              final double _tmpGrndLevel;
              _tmpGrndLevel = _cursor.getDouble(_cursorIndexOfGrndLevel);
              final int _tmpHumidity;
              _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
              final double _tmpTempKf;
              _tmpTempKf = _cursor.getDouble(_cursorIndexOfTempKf);
              _tmpMain = new Main(_tmpTemp,_tmpTempMin,_tmpTempMax,_tmpPressure,_tmpSeaLevel,_tmpGrndLevel,_tmpHumidity,_tmpTempKf);
            }  else  {
              _tmpMain = null;
            }
            _item = new WeatherData(_tmpId,_tmpCityOwnerId,_tmpMain,_tmpWeatherList,_tmpDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
