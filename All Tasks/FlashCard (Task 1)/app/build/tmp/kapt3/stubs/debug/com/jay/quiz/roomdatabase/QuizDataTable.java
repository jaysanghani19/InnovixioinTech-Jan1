package com.jay.quiz.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuizDataTable;", "", "quizNumber", "", "quizName", "", "totalQuestion", "(ILjava/lang/String;I)V", "getQuizName", "()Ljava/lang/String;", "getQuizNumber", "()I", "getTotalQuestion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
@androidx.room.Entity(tableName = "quiz_name")
public final class QuizDataTable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "quizNumber")
    private final int quizNumber = 0;
    @androidx.room.ColumnInfo(name = "quizName")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String quizName = null;
    @androidx.room.ColumnInfo(name = "totalQuestion")
    private final int totalQuestion = 0;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUIZ_TABLE = "quiz_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUIZ_NUMBER = "quizNumber";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUIZ_NAME = "quizName";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TOTAL_QUESTION = "totalQuestion";
    @org.jetbrains.annotations.NotNull
    public static final com.jay.quiz.roomdatabase.QuizDataTable.Companion Companion = null;
    
    public QuizDataTable(int quizNumber, @org.jetbrains.annotations.NotNull
    java.lang.String quizName, int totalQuestion) {
        super();
    }
    
    public final int getQuizNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuizName() {
        return null;
    }
    
    public final int getTotalQuestion() {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jay.quiz.roomdatabase.QuizDataTable copy(int quizNumber, @org.jetbrains.annotations.NotNull
    java.lang.String quizName, int totalQuestion) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuizDataTable$Companion;", "", "()V", "QUIZ_NAME", "", "QUIZ_NUMBER", "QUIZ_TABLE", "TOTAL_QUESTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}