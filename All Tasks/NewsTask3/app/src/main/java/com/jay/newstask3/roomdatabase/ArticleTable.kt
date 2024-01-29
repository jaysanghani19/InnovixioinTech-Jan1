package com.jay.newstask3.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "article_table")
data class ArticleTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    val articleNumber: Int,
    @ColumnInfo(name = AUTHOR)
    val author: String,
    @ColumnInfo(name = CONTENT)
    val content: String,
    @ColumnInfo(name = DESCRIPTION)
    val description: String,
    @ColumnInfo(name = PUBLISHEDAT)
    val publishedAt: String,
    @ColumnInfo(name = TITLE)
    val title: String,
    @ColumnInfo(name = URL)
    val url: String,
    @ColumnInfo(name = URLTOIMAGE)
    val urlToImage: String,
) {
    companion object {
        const val ID = "article_number"
        const val AUTHOR = "author"
        const val CONTENT = "content"
        const val DESCRIPTION = "description"
        const val PUBLISHEDAT = "publishedAt"
        const val TITLE = "title"
        const val URL = "url"
        const val URLTOIMAGE = "urlToImage"
    }
}

