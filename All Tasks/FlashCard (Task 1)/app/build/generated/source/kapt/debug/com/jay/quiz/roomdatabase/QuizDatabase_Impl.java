package com.jay.quiz.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuizDatabase_Impl extends QuizDatabase {
  private volatile QuizDataDao _quizDataDao;

  private volatile QuestionTableDao _questionTableDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `question_table` (`questionNumber` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `quizName` TEXT NOT NULL, `question` TEXT NOT NULL, `option1` TEXT NOT NULL, `option2` TEXT NOT NULL, `option3` TEXT NOT NULL, `option4` TEXT NOT NULL, `answer` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `quiz_name` (`quizNumber` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `quizName` TEXT NOT NULL, `totalQuestion` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '04c6a845376216376b6c6b900415a03a')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `question_table`");
        db.execSQL("DROP TABLE IF EXISTS `quiz_name`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsQuestionTable = new HashMap<String, TableInfo.Column>(8);
        _columnsQuestionTable.put("questionNumber", new TableInfo.Column("questionNumber", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("quizName", new TableInfo.Column("quizName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("question", new TableInfo.Column("question", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("option1", new TableInfo.Column("option1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("option2", new TableInfo.Column("option2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("option3", new TableInfo.Column("option3", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("option4", new TableInfo.Column("option4", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuestionTable.put("answer", new TableInfo.Column("answer", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQuestionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQuestionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQuestionTable = new TableInfo("question_table", _columnsQuestionTable, _foreignKeysQuestionTable, _indicesQuestionTable);
        final TableInfo _existingQuestionTable = TableInfo.read(db, "question_table");
        if (!_infoQuestionTable.equals(_existingQuestionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "question_table(com.jay.quiz.roomdatabase.QuestionTable).\n"
                  + " Expected:\n" + _infoQuestionTable + "\n"
                  + " Found:\n" + _existingQuestionTable);
        }
        final HashMap<String, TableInfo.Column> _columnsQuizName = new HashMap<String, TableInfo.Column>(3);
        _columnsQuizName.put("quizNumber", new TableInfo.Column("quizNumber", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuizName.put("quizName", new TableInfo.Column("quizName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsQuizName.put("totalQuestion", new TableInfo.Column("totalQuestion", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQuizName = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQuizName = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQuizName = new TableInfo("quiz_name", _columnsQuizName, _foreignKeysQuizName, _indicesQuizName);
        final TableInfo _existingQuizName = TableInfo.read(db, "quiz_name");
        if (!_infoQuizName.equals(_existingQuizName)) {
          return new RoomOpenHelper.ValidationResult(false, "quiz_name(com.jay.quiz.roomdatabase.QuizDataTable).\n"
                  + " Expected:\n" + _infoQuizName + "\n"
                  + " Found:\n" + _existingQuizName);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "04c6a845376216376b6c6b900415a03a", "1cfd095af21545ab439346a5589f5de8");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "question_table","quiz_name");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `question_table`");
      _db.execSQL("DELETE FROM `quiz_name`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(QuizDataDao.class, QuizDataDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(QuestionTableDao.class, QuestionTableDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public QuizDataDao getQuizDao() {
    if (_quizDataDao != null) {
      return _quizDataDao;
    } else {
      synchronized(this) {
        if(_quizDataDao == null) {
          _quizDataDao = new QuizDataDao_Impl(this);
        }
        return _quizDataDao;
      }
    }
  }

  @Override
  public QuestionTableDao getQuestionDao() {
    if (_questionTableDao != null) {
      return _questionTableDao;
    } else {
      synchronized(this) {
        if(_questionTableDao == null) {
          _questionTableDao = new QuestionTableDao_Impl(this);
        }
        return _questionTableDao;
      }
    }
  }
}
