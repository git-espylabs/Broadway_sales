package com.espy.broadway_sales.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.espy.broadway_sales.R
import com.espy.broadway_sales.extensions.launchActivity
import com.espy.broadway_sales.preference.AppPreferences
import com.espy.broadway_sales.ui.home.HomeActivity
import com.espy.broadway_sales.ui.profile.view.LoginActivity


class SplashActivity : AppCompatActivity() {

    private val DELAY = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            if (AppPreferences.userId.isNotEmpty()) {
                launchActivity<HomeActivity>()
                finish()
            } else {
                launchActivity<LoginActivity>()
                finish()
            }
        }, DELAY)

    }
}