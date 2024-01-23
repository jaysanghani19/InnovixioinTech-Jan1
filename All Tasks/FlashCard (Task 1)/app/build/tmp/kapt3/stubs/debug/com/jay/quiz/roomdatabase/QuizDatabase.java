package com.jay.quiz.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuizDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getQuestionDao", "Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "getQuizDao", "Lcom/jay/quiz/roomdatabase/QuizDataDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.jay.quiz.roomdatabase.QuestionTable.class, com.jay.quiz.roomdatabase.QuizDataTable.class}, version = 1, exportSchema = false)
public abstract class QuizDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.jay.quiz.roomdatabase.QuizDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.jay.quiz.roomdatabase.QuizDatabase.Companion Companion = null;
    
    public QuizDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.jay.quiz.roomdatabase.QuizDataDao getQuizDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.jay.quiz.roomdatabase.QuestionTableDao getQuestionDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuizDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/jay/quiz/roomdatabase/QuizDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.jay.quiz.roomdatabase.QuizDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}