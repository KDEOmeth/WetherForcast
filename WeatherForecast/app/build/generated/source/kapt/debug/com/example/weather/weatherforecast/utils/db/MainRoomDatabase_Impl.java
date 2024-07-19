package com.example.weather.weatherforecast.utils.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.weather.weatherforecast.features.home.data.local.CitiesDao;
import com.example.weather.weatherforecast.features.home.data.local.CitiesDao_Impl;
import com.example.weather.weatherforecast.features.home.data.local.WeathersDao;
import com.example.weather.weatherforecast.features.home.data.local.WeathersDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MainRoomDatabase_Impl extends MainRoomDatabase {
  private volatile CitiesDao _citiesDao;

  private volatile WeathersDao _weathersDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `City` (`id` INTEGER NOT NULL, `name` TEXT, `country` TEXT, `state` TEXT, `isFavorite` INTEGER NOT NULL, `lon` REAL, `lat` REAL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WeatherData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `city_owner_id` INTEGER NOT NULL, `weatherList` TEXT NOT NULL, `date` TEXT NOT NULL, `temp` REAL NOT NULL, `tempMin` REAL NOT NULL, `tempMax` REAL NOT NULL, `pressure` REAL NOT NULL, `seaLevel` REAL NOT NULL, `grndLevel` REAL NOT NULL, `humidity` INTEGER NOT NULL, `tempKf` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ba7f9bdc33b28d83736707f5f074851c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `City`");
        _db.execSQL("DROP TABLE IF EXISTS `WeatherData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCity = new HashMap<String, TableInfo.Column>(7);
        _columnsCity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("lon", new TableInfo.Column("lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCity.put("lat", new TableInfo.Column("lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCity = new TableInfo("City", _columnsCity, _foreignKeysCity, _indicesCity);
        final TableInfo _existingCity = TableInfo.read(_db, "City");
        if (! _infoCity.equals(_existingCity)) {
          return new RoomOpenHelper.ValidationResult(false, "City(com.example.weather.weatherforecast.features.home.data.models.City).\n"
                  + " Expected:\n" + _infoCity + "\n"
                  + " Found:\n" + _existingCity);
        }
        final HashMap<String, TableInfo.Column> _columnsWeatherData = new HashMap<String, TableInfo.Column>(12);
        _columnsWeatherData.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("city_owner_id", new TableInfo.Column("city_owner_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("weatherList", new TableInfo.Column("weatherList", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("tempMin", new TableInfo.Column("tempMin", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("tempMax", new TableInfo.Column("tempMax", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("pressure", new TableInfo.Column("pressure", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("seaLevel", new TableInfo.Column("seaLevel", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("grndLevel", new TableInfo.Column("grndLevel", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherData.put("tempKf", new TableInfo.Column("tempKf", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherData = new TableInfo("WeatherData", _columnsWeatherData, _foreignKeysWeatherData, _indicesWeatherData);
        final TableInfo _existingWeatherData = TableInfo.read(_db, "WeatherData");
        if (! _infoWeatherData.equals(_existingWeatherData)) {
          return new RoomOpenHelper.ValidationResult(false, "WeatherData(com.example.weather.weatherforecast.features.home.data.models.WeatherData).\n"
                  + " Expected:\n" + _infoWeatherData + "\n"
                  + " Found:\n" + _existingWeatherData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ba7f9bdc33b28d83736707f5f074851c", "0520b540ac3348bf312e02c757a7a292");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "City","WeatherData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `City`");
      _db.execSQL("DELETE FROM `WeatherData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CitiesDao citiesDao() {
    if (_citiesDao != null) {
      return _citiesDao;
    } else {
      synchronized(this) {
        if(_citiesDao == null) {
          _citiesDao = new CitiesDao_Impl(this);
        }
        return _citiesDao;
      }
    }
  }

  @Override
  public WeathersDao weathersDao() {
    if (_weathersDao != null) {
      return _weathersDao;
    } else {
      synchronized(this) {
        if(_weathersDao == null) {
          _weathersDao = new WeathersDao_Impl(this);
        }
        return _weathersDao;
      }
    }
  }
}
