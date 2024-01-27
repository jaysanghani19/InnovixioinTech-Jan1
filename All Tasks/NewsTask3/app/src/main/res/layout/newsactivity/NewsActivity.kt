package layout.newsactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jay.newstask3.R
import com.jay.newstask3.databinding.NewsActivityBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: NewsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.news_activity)
    }
}