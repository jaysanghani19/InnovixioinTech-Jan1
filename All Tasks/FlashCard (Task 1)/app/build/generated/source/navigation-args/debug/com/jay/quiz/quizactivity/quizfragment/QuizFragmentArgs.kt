package com.jay.quiz.quizactivity.quizfragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class QuizFragmentArgs(
  public val quizName: String = "quiz",
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("quiz_name", this.quizName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("quiz_name", this.quizName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): QuizFragmentArgs {
      bundle.setClassLoader(QuizFragmentArgs::class.java.classLoader)
      val __quizName : String?
      if (bundle.containsKey("quiz_name")) {
        __quizName = bundle.getString("quiz_name")
        if (__quizName == null) {
          throw IllegalArgumentException("Argument \"quiz_name\" is marked as non-null but was passed a null value.")
        }
      } else {
        __quizName = "quiz"
      }
      return QuizFragmentArgs(__quizName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): QuizFragmentArgs {
      val __quizName : String?
      if (savedStateHandle.contains("quiz_name")) {
        __quizName = savedStateHandle["quiz_name"]
        if (__quizName == null) {
          throw IllegalArgumentException("Argument \"quiz_name\" is marked as non-null but was passed a null value")
        }
      } else {
        __quizName = "quiz"
      }
      return QuizFragmentArgs(__quizName)
    }
  }
}
