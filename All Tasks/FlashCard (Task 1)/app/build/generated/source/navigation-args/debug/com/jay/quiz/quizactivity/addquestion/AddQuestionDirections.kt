package com.jay.quiz.quizactivity.addquestion

import android.os.Bundle
import androidx.navigation.NavDirections
import com.jay.quiz.R
import kotlin.Int
import kotlin.String

public class AddQuestionDirections private constructor() {
  private data class ActionAddQuestionToQuizFragment(
    public val quizName: String = "quiz",
  ) : NavDirections {
    public override val actionId: Int = R.id.action_addQuestion_to_quizFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("quiz_name", this.quizName)
        return result
      }
  }

  public companion object {
    public fun actionAddQuestionToQuizFragment(quizName: String = "quiz"): NavDirections =
        ActionAddQuestionToQuizFragment(quizName)
  }
}
