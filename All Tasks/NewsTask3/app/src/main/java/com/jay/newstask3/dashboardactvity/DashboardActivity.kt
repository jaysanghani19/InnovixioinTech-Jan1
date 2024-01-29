package com.jay.newstask3.dashboardactvity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.jay.newstask3.NewsAdapter
import com.jay.newstask3.ProgressBarDialog
import com.jay.newstask3.R
import com.jay.newstask3.apiservice.ApiService
import com.jay.newstask3.databinding.DashboardActivityBinding
import com.jay.newstask3.dataclass.Article
import com.jay.newstask3.dataclass.NewsClass
import com.jay.newstask3.newsactivity.NewsActivity
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
import kotlin.collections.ArrayList

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardActivityBinding

    private lateinit var articleTableDao: ArticleTableDao

    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var sharedPreferencesEditor: SharedPreferences.Editor

    private lateinit var newsList: ArrayList<ArticleTable>

    private lateinit var progressBarDialog : ProgressBarDialog

    private var selectedCountry:String = "null"

    private var selectedCategory:String = "null"
    companion object {
        const val FILTER = "Filter"
        const val PERSONALIZE = "Personalize"

        const val SHAREDPREFERENCENAME = "Personalize Data"
        const val ISDATASET = "Data Set Or Not"
        const val COUNTRYPERSONALIZE = "Personalized Country"
        const val CATEGORYPERSONALIZE = "Personalized Category"

        const val NEWSNUMBER = "Number of news"

        val MAPOFCOUNTRIES = mapOf(
            Pair("USA", "us"),
            Pair("India", "in"),
            Pair("France", "fr")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.dashboard_activity)
        articleTableDao = Database.getDatabaseInstance(this).getArticleDao()

        sharedPreferences = getSharedPreferences(SHAREDPREFERENCENAME, Context.MODE_PRIVATE)
        sharedPreferencesEditor = sharedPreferences.edit()

        progressBarDialog = ProgressBarDialog()
        progressBarDialog.show(supportFragmentManager,"Progress Bar")
        newsList = ArrayList<ArticleTable>()
        if (isDataSetOnSharedPreference()) {

            val countryAndCategory = getCountryAndCategory()

            if (countryAndCategory.first.equals("All")) {
                getData(countryAndCategory.second)
                Log.i("shared Preference", "init:  ${countryAndCategory.second}")


            } else {
                val country = MAPOFCOUNTRIES.getValue(countryAndCategory.first)
                Log.i("shared Preference", "init: $country   ${countryAndCategory.second}")
                getData(countryAndCategory.second,country)
            }
        } else {
            getData()
        }

        binding.filterButton.setOnClickListener {
            createEditDialog(FILTER)
        }
        binding.personalzieButton.setOnClickListener {
            createEditDialog(PERSONALIZE)
        }
    }

    private fun isDataSetOnSharedPreference(): Boolean =
        sharedPreferences.getBoolean(ISDATASET, false)

    private fun getCountryAndCategory(): Pair<String, String> {
        val country = sharedPreferences.getString(COUNTRYPERSONALIZE, "all")
        val category = sharedPreferences.getString(CATEGORYPERSONALIZE, "Business")?.toLowerCase()
        return Pair(country!!, category!!)
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
        Log.i("shared Preference", "init: $country   $category")

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
                            articleTableDao.deleteAllEntries()
                            setDataOnDatabase(data.articles)
                            newsList.clear()
                            newsList = getArticles() as ArrayList<ArticleTable>
                            withContext(Dispatchers.Main) {
                                newsList.toList().let { setNewsRecycleView(it) }
                            }
                        }

                    } else {
                        toastMessage("No Data")
                        progressBarDialog.dismiss()
                        binding.newsRV.visibility = View.GONE
                    }
                } else {
                    toastMessage("No Data")
                    progressBarDialog.dismiss()
                    binding.newsRV.visibility = View.GONE

                }
            }

            override fun onFailure(call: Call<NewsClass>, t: Throwable) {
                // Handle the network failure here
                t.localizedMessage?.let { it -> toastMessage(it) }
                progressBarDialog.dismiss()
                binding.newsRV.visibility = View.GONE

            }
        })
    }

    private suspend fun setDataOnDatabase(articles: List<Article>) {
        articles.forEach { it ->
            val author = it.author ?: "null"
            val content = it.content ?: "null"
            val urlToImage = it.urlToImage ?: "null"
            val description = it.description ?: "null"
            val publishedAt = it.publishedAt ?: "null"
            val title = it.title ?: "null"
            val url = it.url ?: "null"
            val articleTable = ArticleTable(
                0,
                author,
                content,
                description,
                publishedAt,
                title,
                url,
                urlToImage
            )
            articleTableDao.insert(articleTable)
        }
    }

    private suspend fun getArticles(): List<ArticleTable> {
        return articleTableDao.getAllEntry()
    }

    private fun setNewsRecycleView(articles: List<ArticleTable>) {
        binding.newsRV.visibility = View.VISIBLE
        binding.newsRV.layoutManager = LinearLayoutManager(this)
        progressBarDialog.dismiss()
        binding.newsRV.adapter = NewsAdapter(articles) { it: ArticleTable ->
            clickListenerOfNews(it)
        }
    }

    private fun clickListenerOfNews(article: ArticleTable) {
        val intent = Intent(this, NewsActivity::class.java)
        intent.putExtra(NEWSNUMBER, article.articleNumber)
        startActivity(intent)
    }

    private fun toastMessage(message: String) {
        Toast.makeText(this@DashboardActivity, message, Toast.LENGTH_SHORT)
            .show()
    }

    private fun createEditDialog(message: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        val dialogView: View = layoutInflater.inflate(R.layout.news_filter_layout, null)
        builder.setView(dialogView)

        val countriesSpinner = dialogView.findViewById<Spinner>(R.id.spinnerCountry)
        val categorySpinner = dialogView.findViewById<Spinner>(R.id.spinnerCategory)
        val applyButton = dialogView.findViewById<Button>(R.id.btnFilter)
        val title = dialogView.findViewById<TextView>(R.id.title)
        if (message.equals(PERSONALIZE)) {
            applyButton.text = "Set"
            title.text = "Personalize"
        } else{
            applyButton.text = "Filter News"
            title.text = "Filter"
        }
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
        val dialog: AlertDialog = builder.create()

        applyButton.setOnClickListener {
            val selectedCountry = countriesSpinner.selectedItem.toString()
            val selectedCategory = categorySpinner.selectedItem.toString()

            progressBarDialog.show(supportFragmentManager,"Progress Bar")

            if (selectedCountry.equals("All")) {
                if (message.equals(PERSONALIZE)) {
                    sharedPreferencesEditor.putString(COUNTRYPERSONALIZE, selectedCountry)
                    sharedPreferencesEditor.putString(CATEGORYPERSONALIZE, selectedCategory)
                    sharedPreferencesEditor.putBoolean(ISDATASET, true)
                    sharedPreferencesEditor.apply()
                }
                getData(selectedCategory.toLowerCase())
                dialog.dismiss()
            } else {
                if (message.equals(PERSONALIZE)) {
                    sharedPreferencesEditor.putString(COUNTRYPERSONALIZE, selectedCountry)
                    sharedPreferencesEditor.putString(CATEGORYPERSONALIZE, selectedCategory)
                    sharedPreferencesEditor.putBoolean(ISDATASET, true)
                    sharedPreferencesEditor.apply()
                }
                getData(selectedCategory.lowercase(), MAPOFCOUNTRIES.getValue(selectedCountry))

                dialog.dismiss()
            }
        }
        dialog.show()
    }
}