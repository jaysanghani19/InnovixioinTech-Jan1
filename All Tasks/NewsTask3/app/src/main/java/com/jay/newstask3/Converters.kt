package com.jay.newstask3

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.jay.newstask3.dataclass.Article

class Converters {
    @TypeConverter
    fun fromArticle(article: Article): String {
        // Convert Article object to a String or another primitive type
        // This could be a JSON representation, or any other format that makes sense
        return Gson().toJson(article)
    }

    @TypeConverter
    fun toArticle(jsonString: String): Article {
        // Convert the stored String back to an Article object
        return Gson().fromJson(jsonString, Article::class.java)
    }
}
