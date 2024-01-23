package com.jay.quiz;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jay.quiz.databinding.AddQuestionFragmentBindingImpl;
import com.jay.quiz.databinding.DashboardActivityBindingImpl;
import com.jay.quiz.databinding.PlayFragmentBindingImpl;
import com.jay.quiz.databinding.QuizFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDQUESTIONFRAGMENT = 1;

  private static final int LAYOUT_DASHBOARDACTIVITY = 2;

  private static final int LAYOUT_PLAYFRAGMENT = 3;

  private static final int LAYOUT_QUIZFRAGMENT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jay.quiz.R.layout.add_question_fragment, LAYOUT_ADDQUESTIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jay.quiz.R.layout.dashboard_activity, LAYOUT_DASHBOARDACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jay.quiz.R.layout.play_fragment, LAYOUT_PLAYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.jay.quiz.R.layout.quiz_fragment, LAYOUT_QUIZFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDQUESTIONFRAGMENT: {
          if ("layout/add_question_fragment_0".equals(tag)) {
            return new AddQuestionFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_question_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DASHBOARDACTIVITY: {
          if ("layout/dashboard_activity_0".equals(tag)) {
            return new DashboardActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dashboard_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYFRAGMENT: {
          if ("layout/play_fragment_0".equals(tag)) {
            return new PlayFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for play_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_QUIZFRAGMENT: {
          if ("layout/quiz_fragment_0".equals(tag)) {
            return new QuizFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for quiz_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/add_question_fragment_0", com.jay.quiz.R.layout.add_question_fragment);
      sKeys.put("layout/dashboard_activity_0", com.jay.quiz.R.layout.dashboard_activity);
      sKeys.put("layout/play_fragment_0", com.jay.quiz.R.layout.play_fragment);
      sKeys.put("layout/quiz_fragment_0", com.jay.quiz.R.layout.quiz_fragment);
    }
  }
}
