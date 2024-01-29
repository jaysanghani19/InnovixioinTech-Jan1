package com.jay.newstask3

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jay.newstask3.roomdatabase.ArticleTable
import com.squareup.picasso.Picasso

class NewsAdapter(
    val newsList: List<ArticleTable>,
    private val clickListener: (ArticleTable) -> Unit,
) :
    RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val newsView = layoutInflater.inflate(R.layout.newses_view, parent, false)
        return NewsViewHolder(newsView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position], clickListener)
    }
}

class NewsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    val posterIV = view.findViewById<ImageView>(R.id.newsPoster)
    val titleTV = view.findViewById<TextView>(R.id.newsTitle)
    val authorTV = view.findViewById<TextView>(R.id.newsAuthor)

    @SuppressLint("SetTextI18n")
    fun bind(article: ArticleTable, clickListener: (ArticleTable) -> Unit) {
        if (!article.urlToImage.equals("null")) {
            Picasso.get().load(article.urlToImage).error(R.drawable.error_icon).into(posterIV)
        } else{
            posterIV.visibility = View.GONE
        }

        if (!article.title.equals("null")) {
            titleTV.text = article.title
        } else{
            titleTV.visibility = View.GONE
        }

        if (!article.author.equals("null")) {
            authorTV.text = "Author : ${article.author}"

        } else{
            authorTV.visibility = View.GONE
        }


        view.setOnClickListener {
            clickListener(article)
        }
    }
}