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
public final class QuestionTableDao_Impl implements QuestionTableDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QuestionTable> __insertionAdapterOfQuestionTable;

  private final EntityDeletionOrUpdateAdapter<QuestionTable> __deletionAdapterOfQuestionTable;

  private final EntityDeletionOrUpdateAdapter<QuestionTable> __updateAdapterOfQuestionTable;

  public QuestionTableDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuestionTable = new EntityInsertionAdapter<QuestionTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `question_table` (`questionNumber`,`quizName`,`question`,`option1`,`option2`,`option3`,`option4`,`answer`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuestionTable entity) {
        statement.bindLong(1, entity.getQuestionNumber());
        if (entity.getQuizName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getQuizName());
        }
        if (entity.getQuestion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getQuestion());
        }
        if (entity.getOption1() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOption1());
        }
        if (entity.getOption2() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOption2());
        }
        if (entity.getOption3() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getOption3());
        }
        if (entity.getOption4() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getOption4());
        }
        statement.bindLong(8, entity.getAnswer());
      }
    };
    this.__deletionAdapterOfQuestionTable = new EntityDeletionOrUpdateAdapter<QuestionTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `question_table` WHERE `questionNumber` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuestionTable entity) {
        statement.bindLong(1, entity.getQuestionNumber());
      }
    };
    this.__updateAdapterOfQuestionTable = new EntityDeletionOrUpdateAdapter<QuestionTable>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `question_table` SET `questionNumber` = ?,`quizName` = ?,`question` = ?,`option1` = ?,`option2` = ?,`option3` = ?,`option4` = ?,`answer` = ? WHERE `questionNumber` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final QuestionTable entity) {
        statement.bindLong(1, entity.getQuestionNumber());
        if (entity.getQuizName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getQuizName());
        }
        if (entity.getQuestion() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getQuestion());
        }
        if (entity.getOption1() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getOption1());
        }
        if (entity.getOption2() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOption2());
        }
        if (entity.getOption3() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getOption3());
        }
        if (entity.getOption4() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getOption4());
        }
        statement.bindLong(8, entity.getAnswer());
        statement.bindLong(9, entity.getQuestionNumber());
      }
    };
  }

  @Override
  public void insertQuestion(final QuestionTable questionTable) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestionTable.insert(questionTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteQuestion(final QuestionTable questionTable) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __deletionAdapterOfQuestionTable.handle(questionTable);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateQuestion(final QuestionTable questionTable) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfQuestionTable.handle(questionTable);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<QuestionTable>> getQuestionOfTheQuiz(final String quizName) {
    final String _sql = "SELECT * FROM question_table WHERE quizName= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (quizName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, quizName);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"question_table"}, false, new Callable<List<QuestionTable>>() {
      @Override
      @Nullable
      public List<QuestionTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfQuestionNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "questionNumber");
          final int _cursorIndexOfQuizName = CursorUtil.getColumnIndexOrThrow(_cursor, "quizName");
          final int _cursorIndexOfQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "question");
          final int _cursorIndexOfOption1 = CursorUtil.getColumnIndexOrThrow(_cursor, "option1");
          final int _cursorIndexOfOption2 = CursorUtil.getColumnIndexOrThrow(_cursor, "option2");
          final int _cursorIndexOfOption3 = CursorUtil.getColumnIndexOrThrow(_cursor, "option3");
          final int _cursorIndexOfOption4 = CursorUtil.getColumnIndexOrThrow(_cursor, "option4");
          final int _cursorIndexOfAnswer = CursorUtil.getColumnIndexOrThrow(_cursor, "answer");
          final List<QuestionTable> _result = new ArrayList<QuestionTable>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final QuestionTable _item;
            final int _tmpQuestionNumber;
            _tmpQuestionNumber = _cursor.getInt(_cursorIndexOfQuestionNumber);
            final String _tmpQuizName;
            if (_cursor.isNull(_cursorIndexOfQuizName)) {
              _tmpQuizName = null;
            } else {
              _tmpQuizName = _cursor.getString(_cursorIndexOfQuizName);
            }
            final String _tmpQuestion;
            if (_cursor.isNull(_cursorIndexOfQuestion)) {
              _tmpQuestion = null;
            } else {
              _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
            }
            final String _tmpOption1;
            if (_cursor.isNull(_cursorIndexOfOption1)) {
              _tmpOption1 = null;
            } else {
              _tmpOption1 = _cursor.getString(_cursorIndexOfOption1);
            }
            final String _tmpOption2;
            if (_cursor.isNull(_cursorIndexOfOption2)) {
              _tmpOption2 = null;
            } else {
              _tmpOption2 = _cursor.getString(_cursorIndexOfOption2);
            }
            final String _tmpOption3;
            if (_cursor.isNull(_cursorIndexOfOption3)) {
              _tmpOption3 = null;
            } else {
              _tmpOption3 = _cursor.getString(_cursorIndexOfOption3);
            }
            final String _tmpOption4;
            if (_cursor.isNull(_cursorIndexOfOption4)) {
              _tmpOption4 = null;
            } else {
              _tmpOption4 = _cursor.getString(_cursorIndexOfOption4);
            }
            final int _tmpAnswer;
            _tmpAnswer = _cursor.getInt(_cursorIndexOfAnswer);
            _item = new QuestionTable(_tmpQuestionNumber,_tmpQuizName,_tmpQuestion,_tmpOption1,_tmpOption2,_tmpOption3,_tmpOption4,_tmpAnswer);
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
