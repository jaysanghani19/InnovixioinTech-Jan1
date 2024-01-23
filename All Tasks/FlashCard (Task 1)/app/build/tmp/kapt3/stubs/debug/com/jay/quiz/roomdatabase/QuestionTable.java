package com.jay.quiz.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006&"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuestionTable;", "", "questionNumber", "", "quizName", "", "question", "option1", "option2", "option3", "option4", "answer", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAnswer", "()I", "getOption1", "()Ljava/lang/String;", "getOption2", "getOption3", "getOption4", "getQuestion", "getQuestionNumber", "getQuizName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
@androidx.room.Entity(tableName = "question_table")
public final class QuestionTable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo
    private final int questionNumber = 0;
    @androidx.room.ColumnInfo(name = "quizName")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String quizName = null;
    @androidx.room.ColumnInfo(name = "question")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String question = null;
    @androidx.room.ColumnInfo(name = "option1")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String option1 = null;
    @androidx.room.ColumnInfo(name = "option2")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String option2 = null;
    @androidx.room.ColumnInfo(name = "option3")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String option3 = null;
    @androidx.room.ColumnInfo(name = "option4")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String option4 = null;
    @androidx.room.ColumnInfo(name = "answer")
    private final int answer = 0;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUESTION_TABLE = "question_table";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUIZ_NAME = "quizName";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUESTION = "question";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPTION1 = "option1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPTION2 = "option2";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPTION3 = "option3";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OPTION4 = "option4";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ANSWER = "answer";
    @org.jetbrains.annotations.NotNull
    public static final com.jay.quiz.roomdatabase.QuestionTable.Companion Companion = null;
    
    public QuestionTable(int questionNumber, @org.jetbrains.annotations.NotNull
    java.lang.String quizName, @org.jetbrains.annotations.NotNull
    java.lang.String question, @org.jetbrains.annotations.NotNull
    java.lang.String option1, @org.jetbrains.annotations.NotNull
    java.lang.String option2, @org.jetbrains.annotations.NotNull
    java.lang.String option3, @org.jetbrains.annotations.NotNull
    java.lang.String option4, int answer) {
        super();
    }
    
    public final int getQuestionNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuizName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOption1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOption2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOption3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOption4() {
        return null;
    }
    
    public final int getAnswer() {
        return 0;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jay.quiz.roomdatabase.QuestionTable copy(int questionNumber, @org.jetbrains.annotations.NotNull
    java.lang.String quizName, @org.jetbrains.annotations.NotNull
    java.lang.String question, @org.jetbrains.annotations.NotNull
    java.lang.String option1, @org.jetbrains.annotations.NotNull
    java.lang.String option2, @org.jetbrains.annotations.NotNull
    java.lang.String option3, @org.jetbrains.annotations.NotNull
    java.lang.String option4, int answer) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jay/quiz/roomdatabase/QuestionTable$Companion;", "", "()V", "ANSWER", "", "OPTION1", "OPTION2", "OPTION3", "OPTION4", "QUESTION", "QUESTION_TABLE", "QUIZ_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}