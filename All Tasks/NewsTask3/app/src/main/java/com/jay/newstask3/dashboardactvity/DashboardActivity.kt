package com.jay.newstask3.dashboardactvity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jay.newstask3.databinding.DashboardActivityBinding
import com.jay.newstask3.R
import com.jay.newstask3.apiservice.ApiService
import com.jay.newstask3.dataclass.NewsClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.dashboard_activity)
        getData()
    }

//    private fun getData(){
//        Log.i("news", "started Fetching Data")
//
//        val data = ApiService.apiService.getNews()
//        Log.i("news", "Fetched Data ${data.isExecuted}")
//
//        data.enqueue(object : Callback<NewsClass>{
//            override fun onResponse(call: Call<NewsClass>, response: Response<NewsClass>) {
//                if (response.isSuccessful){
//                    val data : NewsClass? = response.body()
//                    data?.news?.forEach {
//                        Log.i("news", "onResponse: ${it.Description}")
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<NewsClass>, t: Throwable) {
//                Toast.makeText(this@DashboardActivity, "${t.localizedMessage}", Toast.LENGTH_SHORT).show()
//            }
//
//        })
//    }

    private fun getData() {
        Log.i("news", "started Fetching Data")

        // Initiate the API request
        val dataCall: Call<NewsClass> = ApiService.apiService.getNews()

        // Enqueue the request and handle the response asynchronously
        dataCall.enqueue(object : Callback<NewsClass> {
            override fun onResponse(call: Call<NewsClass>, response: Response<NewsClass>) {
                if (response.isSuccessful) {
                    // Handle the successful response here
                    val data: NewsClass? = response.body()
                    data?.articles?.forEach {
                        Log.i("Tag", "onResult : ${it.author}")
                    }
                } else {
                    // Handle the error response
//                    Log.e("news", "Request Headers: ${response.headers().toString()}")
//                    Log.e("news", "Request Message: ${response.body().toString()}")
                    Log.e("news", "API request failed with code: ${response.code()}")
                    Log.e("news", "Error Response Body: ${response.errorBody()?.string()}")
                }
            }

            override fun onFailure(call: Call<NewsClass>, t: Throwable) {
                // Handle the network failure here
                Log.e("news", "API request failed with exception: ${t.localizedMessage}")
                Toast.makeText(this@DashboardActivity, "${t.localizedMessage}", Toast.LENGTH_SHORT)
                    .show()
            }
        })

        // Note: Don't check isExecuted immediately after enqueue, as it will not provide the correct information
        // Log.i("news", "Fetched Data ${data.isExecuted}")
    }

}