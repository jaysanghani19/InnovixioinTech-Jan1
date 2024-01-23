package com.jay.quiz.quizactivity.quizfragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0001H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/jay/quiz/quizactivity/quizfragment/QuizFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/jay/quiz/databinding/QuizFragmentBinding;", "isQuestionsAreSet", "", "questionDao", "Lcom/jay/quiz/roomdatabase/QuestionTableDao;", "clickListenerOfAddButton", "", "quizName", "", "clickListenerOfPlayButton", "init", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "fragment", "setQuestionRecyclerView", "showAddDialog", "app_debug"})
public final class QuizFragment extends androidx.fragment.app.Fragment {
    private com.jay.quiz.databinding.QuizFragmentBinding binding;
    private com.jay.quiz.roomdatabase.QuestionTableDao questionDao;
    private boolean isQuestionsAreSet = false;
    
    public QuizFragment() {
        super();
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
    
    private final void setQuestionRecyclerView(java.lang.String quizName) {
    }
    
    private final void clickListenerOfAddButton(java.lang.String quizName) {
    }
    
    private final void clickListenerOfPlayButton(java.lang.String quizName) {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    private final void showAddDialog(java.lang.String quizName) {
    }
}