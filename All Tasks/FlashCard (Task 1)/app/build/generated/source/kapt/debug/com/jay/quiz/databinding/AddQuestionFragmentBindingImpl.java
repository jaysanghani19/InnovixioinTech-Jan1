package com.jay.quiz.databinding;
import com.jay.quiz.R;
import com.jay.quiz.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddQuestionFragmentBindingImpl extends AddQuestionFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.questionLabel, 1);
        sViewsWithIds.put(R.id.questionEditText, 2);
        sViewsWithIds.put(R.id.optionsLabel, 3);
        sViewsWithIds.put(R.id.option1EditText, 4);
        sViewsWithIds.put(R.id.option2EditText, 5);
        sViewsWithIds.put(R.id.option3EditText, 6);
        sViewsWithIds.put(R.id.option4EditText, 7);
        sViewsWithIds.put(R.id.optionsRadioGroup, 8);
        sViewsWithIds.put(R.id.option1_radio_button, 9);
        sViewsWithIds.put(R.id.option2_radio_button, 10);
        sViewsWithIds.put(R.id.option3_radio_button, 11);
        sViewsWithIds.put(R.id.option4_radio_button, 12);
        sViewsWithIds.put(R.id.submitButton, 13);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AddQuestionFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private AddQuestionFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[4]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.EditText) bindings[5]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.EditText) bindings[7]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[13]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}