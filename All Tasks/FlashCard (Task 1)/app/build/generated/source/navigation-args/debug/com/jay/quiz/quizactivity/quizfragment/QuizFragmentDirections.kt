package com.jay.quiz.quizactivity.quizfragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.jay.quiz.R

public class QuizFragmentDirections private constructor() {
  public companion object {
    public fun actionQuizFragmentToAddQuestion(): NavDirections =
        ActionOnlyNavDirections(R.id.action_quizFragment_to_addQuestion)
  }
}
