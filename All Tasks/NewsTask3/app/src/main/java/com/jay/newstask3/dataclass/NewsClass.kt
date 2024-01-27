package com.jay.newstask3.dataclass

data class NewsClass(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int,
)