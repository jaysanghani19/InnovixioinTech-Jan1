package com.jay.quiz.quizactivity.playfragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/jay/quiz/quizactivity/playfragment/PlayFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/jay/quiz/databinding/PlayFragmentBinding;", "dao", "Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "quizName", "", "getQuizName", "()Ljava/lang/String;", "setQuizName", "(Ljava/lang/String;)V", "viewModel", "Lcom/jay/quiz/quizactivity/playfragment/PlayFragmentViewModel;", "clickListeners", "", "clickListenersOfNextButton", "init", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "fragment", "showAlertDialog", "score", "", "totalQuestions", "app_debug"})
public final class PlayFragment extends androidx.fragment.app.Fragment {
    private com.jay.quiz.databinding.PlayFragmentBinding binding;
    private com.jay.quiz.quizactivity.playfragment.PlayFragmentViewModel viewModel;
    private com.jay.quiz.roomdatabase.QuestionTableDao dao;
    @org.jetbrains.annotations.Nullable
    private java.lang.String quizName;
    
    public PlayFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getQuizName() {
        return null;
    }
    
    public final void setQuizName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void clickListeners() {
    }
    
    private final void clickListenersOfNextButton() {
    }
    
    private final void showAlertDialog(int score, int totalQuestions) {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment) {
    }
}