package com.jay.newstask3.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ArticleTableDao {
    @Insert
    fun insert(articles: List<ArticleTable>)

    @Insert
    fun insert(article: ArticleTable)

    @Query("SELECT * FROM article_table")
    fun getAllEntry(): List<ArticleTable>

    @Query("DELETE FROM article_table")
    fun deleteAllEntries()

    @Query("SELECT * FROM article_table WHERE article_number = :articleNumber")
    fun getArticle(articleNumber : Int): ArticleTable
}