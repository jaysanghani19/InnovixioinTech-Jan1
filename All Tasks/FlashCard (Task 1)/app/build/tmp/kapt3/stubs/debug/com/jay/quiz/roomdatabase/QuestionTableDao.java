package com.jay.quiz.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "", "deleteQuestion", "", "questionTable", "Lcom/jay/quiz/roomdatabase/QuestionTable;", "getQuestionOfTheQuiz", "Landroidx/lifecycle/LiveData;", "", "quizName", "", "insertQuestion", "", "updateQuestion", "app_debug"})
@androidx.room.Dao
public abstract interface QuestionTableDao {
    
    @androidx.room.Insert
    public abstract void insertQuestion(@org.jetbrains.annotations.NotNull
    com.jay.quiz.roomdatabase.QuestionTable questionTable);
    
    @androidx.room.Update
    public abstract int updateQuestion(@org.jetbrains.annotations.NotNull
    com.jay.quiz.roomdatabase.QuestionTable questionTable);
    
    @androidx.room.Delete
    public abstract int deleteQuestion(@org.jetbrains.annotations.NotNull
    com.jay.quiz.roomdatabase.QuestionTable questionTable);
    
    @androidx.room.Query(value = "SELECT * FROM question_table WHERE quizName= :quizName")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jay.quiz.roomdatabase.QuestionTable>> getQuestionOfTheQuiz(@org.jetbrains.annotations.NotNull
    java.lang.String quizName);
}