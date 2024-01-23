package com.jay.quiz.roomdatabase;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuizDataDao_Impl implements QuizDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QuizDataTable> __insertionAdapterOfQuizDataTable;

  private final EntityDeletionOrUpdateAdapter<QuizDataTable> __deletionAdapterOfQuizDataTable;

  private final EntityDeletionOrUpdateAdapter<QuizDataTable> __updateAdapterOfQuizDataTable;

  public QuizDataDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuizDataTable = new EntityInsertionAdapter<QuizDataTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `quiz_name` (`quizNumber`,`quizName`,`totalQuestion`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuizDataTable entity) {
        statement.bindLong(1, entity.getQuizNumber());
        if (entity.getQuizName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getQuizName());
        }
        statement.bindLong(3, entity.getTotalQuestion());
      }
    };
    this.__deletionAdapterOfQuizDataTable = new EntityDeletionOrUpdateAdapter<QuizDataTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `quiz_name` WHERE `quizNumber` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuizDataTable entity) {
        statement.bindLong(1, entity.getQuizNumber());
      }
    };
    this.__updateAdapterOfQuizDataTable = new EntityDeletionOrUpdateAdapter<QuizDataTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `quiz_name` SET `quizNumber` = ?,`quizName` = ?,`totalQuestion` = ? WHERE `quizNumber` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuizDataTable entity) {
        statement.bindLong(1, entity.getQuizNumber());
        if (entity.getQuizName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getQuizName());
        }
        statement.bindLong(3, entity.getTotalQuestion());
        statement.bindLong(4, entity.getQuizNumber());
      }
    };
  }

  @Override
  public void insertQuiz(final QuizDataTable quizDataTable) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuizDataTable.insert(quizDataTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteQuiz(final QuizDataTable quizDataTable) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __deletionAdapterOfQuizDataTable.handle(quizDataTable);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateQuiz(final QuizDataTable quizDataTable) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfQuizDataTable.handle(quizDataTable);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<QuizDataTable>> getAllQuiz() {
    final String _sql = "SELECT * FROM quiz_name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"quiz_name"}, false, new Callable<List<QuizDataTable>>() {
      @Override
      @Nullable
      public List<QuizDataTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfQuizNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "quizNumber");
          final int _cursorIndexOfQuizName = CursorUtil.getColumnIndexOrThrow(_cursor, "quizName");
          final int _cursorIndexOfTotalQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "totalQuestion");
          final List<QuizDataTable> _result = new ArrayList<QuizDataTable>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final QuizDataTable _item;
            final int _tmpQuizNumber;
            _tmpQuizNumber = _cursor.getInt(_cursorIndexOfQuizNumber);
            final String _tmpQuizName;
            if (_cursor.isNull(_cursorIndexOfQuizName)) {
              _tmpQuizName = null;
            } else {
              _tmpQuizName = _cursor.getString(_cursorIndexOfQuizName);
            }
            final int _tmpTotalQuestion;
            _tmpTotalQuestion = _cursor.getInt(_cursorIndexOfTotalQuestion);
            _item = new QuizDataTable(_tmpQuizNumber,_tmpQuizName,_tmpTotalQuestion);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
