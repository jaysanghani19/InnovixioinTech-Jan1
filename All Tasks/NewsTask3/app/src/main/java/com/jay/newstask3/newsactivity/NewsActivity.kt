package com.jay.newstask3.newsactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jay.newstask3.databinding.NewsActivityBinding
import com.jay.newstask3.R
import com.jay.newstask3.dashboardactvity.DashboardActivity
import com.jay.newstask3.roomdatabase.ArticleTable
import com.jay.newstask3.roomdatabase.ArticleTableDao
import com.jay.newstask3.roomdatabase.Database
import com.squareup.picasso.Picasso
import com.squareup.picasso.PicassoProvider
import kotlinx.coroutines.*

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: NewsActivityBinding

    private lateinit var articleTableDao: ArticleTableDao

    private lateinit var article: ArticleTable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.news_activity)
        val data = intent
        val articleNumber = data.getIntExtra(DashboardActivity.NEWSNUMBER, 0)

        articleTableDao = Database.getDatabaseInstance(this)?.getArticleDao()!!

        GlobalScope.launch {
            article = getArticle(articleNumber)
            withContext(Dispatchers.Main) {
                setDataOnUI()
            }
        }

        binding.articleUrlTV.setOnClickListener {
            openArticle()
        }
        binding.contentTV.setOnClickListener {
            openArticle()
        }
    }

    private fun openArticle() {
        val url = article.url

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    suspend fun getArticle(articleNumber: Int): ArticleTable {
        return articleTableDao.getArticle(articleNumber)
    }

    private fun setDataOnUI() {
        binding.titleTV.text = article.title
        if (!article.urlToImage.equals("null")) {
            Picasso.get().load(article.urlToImage).error(R.drawable.error_icon)
                .into(binding.articleImage)
        } else {
            binding.articleImage.visibility = View.GONE
        }

        if (!article.author.equals("null")) {
            binding.authorTV.text = "Author : ${article.author}"
        } else {
            binding.authorTV.visibility = View.GONE
        }

        if (!article.content.equals("null")) {
            binding.contentTV.text = "${article.content}   ...Read More"
        } else {
            binding.contentTV.visibility = View.GONE
        }

        if (!article.url.equals("null")) {
            binding.articleUrlTV.text = "Article Link : ${article.url}"
        } else {
            binding.articleUrlTV.visibility = View.GONE
        }
    }
}