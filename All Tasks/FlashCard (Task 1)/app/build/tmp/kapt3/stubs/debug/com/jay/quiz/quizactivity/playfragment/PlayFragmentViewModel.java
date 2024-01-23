package com.jay.quiz.quizactivity.playfragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020!R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006("}, d2 = {"Lcom/jay/quiz/quizactivity/playfragment/PlayFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "(Lcom/jay/quiz/roomdatabase/QuestionTableDao;)V", "_currentQuestion", "Landroidx/lifecycle/MutableLiveData;", "Lcom/jay/quiz/roomdatabase/QuestionTable;", "_isGameFinished", "", "_score", "", "currentQuestion", "Landroidx/lifecycle/LiveData;", "getCurrentQuestion", "()Landroidx/lifecycle/LiveData;", "getDao", "()Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "isGameFinished", "ques", "", "getQues", "()Ljava/util/List;", "setQues", "(Ljava/util/List;)V", "score", "getScore", "totalQuestion", "getTotalQuestion", "()I", "setTotalQuestion", "(I)V", "nextButtonClick", "", "answer", "setNextQuestion", "setQuestions", "quizName", "", "skipButtonClick", "app_debug"})
public final class PlayFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.jay.quiz.roomdatabase.QuestionTableDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.jay.quiz.roomdatabase.QuestionTable> _currentQuestion = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isGameFinished = null;
    private int totalQuestion = 0;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.jay.quiz.roomdatabase.QuestionTable> ques;
    
    public PlayFragmentViewModel(@org.jetbrains.annotations.NotNull
    com.jay.quiz.roomdatabase.QuestionTableDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jay.quiz.roomdatabase.QuestionTableDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.jay.quiz.roomdatabase.QuestionTable> getCurrentQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isGameFinished() {
        return null;
    }
    
    public final int getTotalQuestion() {
        return 0;
    }
    
    public final void setTotalQuestion(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.jay.quiz.roomdatabase.QuestionTable> getQues() {
        return null;
    }
    
    public final void setQues(@org.jetbrains.annotations.Nullable
    java.util.List<com.jay.quiz.roomdatabase.QuestionTable> p0) {
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull
    java.lang.String quizName) {
    }
    
    public final void skipButtonClick() {
    }
    
    public final void nextButtonClick(int answer) {
    }
    
    public final void setNextQuestion() {
    }
}