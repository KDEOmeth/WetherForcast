package com.example.weather.weatherforecast.features.home.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weather.weatherforecast.features.home.data.models.City;
import com.example.weather.weatherforecast.features.home.data.models.Coordinates;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CitiesDao_Impl extends CitiesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<City> __insertionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __deletionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __updateAdapterOfCity;

  private final SharedSQLiteStatement __preparedStmtOfSetDefaultCity;

  public CitiesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCity = new EntityInsertionAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `City` (`id`,`name`,`country`,`state`,`isFavorite`,`lon`,`lat`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountry());
        }
        if (value.getState() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getState());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final Coordinates _tmpCoordinates = value.getCoordinates();
        if(_tmpCoordinates != null) {
          stmt.bindDouble(6, _tmpCoordinates.getLon());
          stmt.bindDouble(7, _tmpCoordinates.getLat());
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
      }
    };
    this.__deletionAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `City` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `City` SET `id` = ?,`name` = ?,`country` = ?,`state` = ?,`isFavorite` = ?,`lon` = ?,`lat` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountry());
        }
        if (value.getState() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getState());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final Coordinates _tmpCoordinates = value.getCoordinates();
        if(_tmpCoordinates != null) {
          stmt.bindDouble(6, _tmpCoordinates.getLon());
          stmt.bindDouble(7, _tmpCoordinates.getLat());
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
        }
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfSetDefaultCity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE city SET isFavorite = 1 WHERE id = (SELECT id FROM city WHERE name LIKE '%'||?||'%' and country LIKE '%'||?||'%' LIMIT 1)";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final City item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCity.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<? extends City> itemList, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCity.insert(itemList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final City item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final City item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public int setDefaultCity(final String cityName, final String countryCode) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetDefaultCity.acquire();
    int _argIndex = 1;
    if (cityName == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, cityName);
    }
    _argIndex = 2;
    if (countryCode == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, countryCode);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetDefaultCity.release(_stmt);
    }
  }

  @Override
  public Flow<List<City>> getAllCities() {
    final String _sql = "SELECT * FROM city";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"city"}, new Callable<List<City>>() {
      @Override
      public List<City> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final List<City> _result = new ArrayList<City>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final City _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final Coordinates _tmpCoordinates;
            if (! (_cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final double _tmpLon;
              _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              _tmpCoordinates = new Coordinates(_tmpLon,_tmpLat);
            }  else  {
              _tmpCoordinates = null;
            }
            _item = new City(_tmpId,_tmpName,_tmpCountry,_tmpState,_tmpCoordinates,_tmpIsFavorite);
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

  @Override
  public Flow<List<City>> getFavoriteCities() {
    final String _sql = "SELECT * FROM city WHERE isFavorite = 1 LIMIT 5";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"city"}, new Callable<List<City>>() {
      @Override
      public List<City> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final List<City> _result = new ArrayList<City>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final City _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final Coordinates _tmpCoordinates;
            if (! (_cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final double _tmpLon;
              _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              _tmpCoordinates = new Coordinates(_tmpLon,_tmpLat);
            }  else  {
              _tmpCoordinates = null;
            }
            _item = new City(_tmpId,_tmpName,_tmpCountry,_tmpState,_tmpCoordinates,_tmpIsFavorite);
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

  @Override
  public Flow<List<City>> searchForCity(final String query) {
    final String _sql = "SELECT * FROM city WHERE name LIKE '%'||?||'%' or state LIKE '%'||?||'%' or country LIKE '%'||?||'%' LIMIT 1000";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 3;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"city"}, new Callable<List<City>>() {
      @Override
      public List<City> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final int _cursorIndexOfLon = CursorUtil.getColumnIndexOrThrow(_cursor, "lon");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final List<City> _result = new ArrayList<City>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final City _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCountry;
            _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            final Coordinates _tmpCoordinates;
            if (! (_cursor.isNull(_cursorIndexOfLon) && _cursor.isNull(_cursorIndexOfLat))) {
              final double _tmpLon;
              _tmpLon = _cursor.getDouble(_cursorIndexOfLon);
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              _tmpCoordinates = new Coordinates(_tmpLon,_tmpLat);
            }  else  {
              _tmpCoordinates = null;
            }
            _item = new City(_tmpId,_tmpName,_tmpCountry,_tmpState,_tmpCoordinates,_tmpIsFavorite);
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
