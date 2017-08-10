package com.example.asiantech.topmovies.ui.initial

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.base.BaseActivity
import com.example.asiantech.topmovies.ui.main.MainActivity

class SplashActivity : BaseActivity(), Runnable {

    val TIME_DELAY: Long = 1000
    var mHandler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mHandler = Handler()
        mHandler!!.postDelayed(this, TIME_DELAY)
    }

    override fun run() {
        startActivity(Intent(this, MainActivity::class.java))
        this.finish()
    }

    override fun onResume() {
        if (null == mHandler) {
            mHandler = Handler()
        }
        super.onResume()
    }

    override fun onPause() {
        mHandler?.removeCallbacks(this)
        super.onPause()
    }

    override fun onDestroy() {
        mHandler?.removeCallbacks(this)
        super.onDestroy()
    }

}
