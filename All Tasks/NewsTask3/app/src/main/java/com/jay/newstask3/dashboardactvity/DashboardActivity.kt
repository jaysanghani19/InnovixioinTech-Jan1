package com.jay.newstask3.dashboardactvity

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.jay.newstask3.NewsAdapter
import com.jay.newstask3.R
import com.jay.newstask3.apiservice.ApiService
import com.jay.newstask3.databinding.DashboardActivityBinding
import com.jay.newstask3.dataclass.Article
import com.jay.newstask3.dataclass.NewsClass
import com.jay.newstask3.roomdatabase.ArticleTable
import com.jay.newstask3.roomdatabase.ArticleTableDao
import com.jay.newstask3.roomdatabase.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardActivityBinding

    private lateinit var articleTableDao: ArticleTableDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.dashboard_activity)
        articleTableDao = Database.getDatabaseInstance(this).getArticleDao()
        getData()
        binding.filterButton.setOnClickListener {
            createFilterDialog()
        }
    }

    private fun getData() {
        val dataCall: Call<NewsClass> = ApiService.apiService.getNews()
        checkDataIsFetched(dataCall)
    }

    private fun getData(category: String) {
        // Initiate the API request
        val dataCall: Call<NewsClass> = ApiService.apiService.getNews(category)
        checkDataIsFetched(dataCall)
    }

    private fun getData(category: String, country: String) {
        val dataCall: Call<NewsClass> = ApiService.apiService.getNews(category, country)
        checkDataIsFetched(dataCall)
    }

    private fun checkDataIsFetched(datacall: Call<NewsClass>) {
        // Enqueue the request and handle the response asynchronously
        datacall.enqueue(object : Callback<NewsClass> {
            override fun onResponse(call: Call<NewsClass>, response: Response<NewsClass>) {
                if (response.isSuccessful) {
                    val data: NewsClass? = response.body()
                    if (data?.articles?.isNotEmpty()!!) {
                        GlobalScope.launch {
                            setDataOnDatabase(data.articles)
                            val newsArticles = getArticles()
                            withContext(Dispatchers.Main) {
                                newsArticles.let { setNewsRecycleView(it) }
                            }
                        }

                    } else {
//                        toastMessage("T")
                    }
                } else {


                }
            }

            override fun onFailure(call: Call<NewsClass>, t: Throwable) {
                // Handle the network failure here
                t.localizedMessage?.let { it -> toastMessage(it) }
            }
        })
    }

    private suspend fun setDataOnDatabase(articles: List<Article>) {
        articles.forEach { it ->
            val author = it.author
            val content = it.content
            val articleTable = ArticleTable(
                0,
                author,
                content,
                it.description,
                it.publishedAt,
                it.title,
                it.url,
                it.urlToImage
            )
            articleTableDao.insert(articleTable)
        }
    }

    private suspend fun getArticles(): List<ArticleTable> {
        return articleTableDao.getAllEntry()
    }

    private fun setNewsRecycleView(articles: List<ArticleTable>) {
        binding.newsRV.layoutManager = LinearLayoutManager(this)
        binding.newsRV.adapter = NewsAdapter(articles) { it: ArticleTable ->
            clickListenerOfNews(it)
        }
    }

    private fun clickListenerOfNews(article: ArticleTable) {

    }

    private fun toastMessage(message: String) {
        Toast.makeText(this@DashboardActivity, message, Toast.LENGTH_SHORT)
            .show()
    }

    private fun createFilterDialog() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        val dialogView: View = layoutInflater.inflate(R.layout.news_filter_layout, null)
        builder.setView(dialogView)

        val countriesSpinner = dialogView.findViewById<Spinner>(R.id.spinnerCountry)
        val categorySpinner = dialogView.findViewById<Spinner>(R.id.spinnerCategory)
        val applyButton = dialogView.findViewById<Button>(R.id.btnFilter)

        ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            countriesSpinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.categories,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            categorySpinner.adapter = adapter
        }

        applyButton.setOnClickListener {
            val selectedCountry = countriesSpinner.selectedItem.toString()
            val selectedCategory = categorySpinner.selectedItem.toString()

            if (selectedCountry.equals("All")) {
                getData(selectedCategory)
            } else {
                getData(selectedCategory, selectedCountry)
            }

        }
        val dialog: AlertDialog = builder.create()

        dialog.show()
    }
}