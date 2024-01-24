package com.jay.newstask3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.jay.newstask3.dashboardactvity.DashboardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }
    private fun init(){
        setContentView(R.layout.activity_main)

        val runnable = Runnable {
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

        val handler = Handler()
        handler.postDelayed(runnable,1500)
    }

}