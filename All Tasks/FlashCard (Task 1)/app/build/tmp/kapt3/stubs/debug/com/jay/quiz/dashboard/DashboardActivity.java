package com.jay.quiz.dashboard;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/jay/quiz/dashboard/DashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "binding", "Lcom/jay/quiz/databinding/DashboardActivityBinding;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "quizDataDao", "Lcom/jay/quiz/roomdatabase/QuizDataDao;", "clickListenerOfAddButton", "", "clickListenerOfRecyclerView", "quiz", "Lcom/jay/quiz/roomdatabase/QuizDataTable;", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setClickListeners", "setQuizes", "showCustomDialog", "toastMessage", "message", "", "Companion", "app_debug"})
public final class DashboardActivity extends androidx.appcompat.app.AppCompatActivity implements kotlinx.coroutines.CoroutineScope {
    private com.jay.quiz.databinding.DashboardActivityBinding binding;
    private com.jay.quiz.roomdatabase.QuizDataDao quizDataDao;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String QUIZ_NAME_KEY = "Quiz Name";
    @org.jetbrains.annotations.NotNull
    public static final com.jay.quiz.dashboard.DashboardActivity.Companion Companion = null;
    
    public DashboardActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setClickListeners() {
    }
    
    private final void clickListenerOfAddButton() {
    }
    
    private final void showCustomDialog() {
    }
    
    private final void toastMessage(java.lang.String message) {
    }
    
    private final void setQuizes() {
    }
    
    private final void clickListenerOfRecyclerView(com.jay.quiz.roomdatabase.QuizDataTable quiz) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jay/quiz/dashboard/DashboardActivity$Companion;", "", "()V", "QUIZ_NAME_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}