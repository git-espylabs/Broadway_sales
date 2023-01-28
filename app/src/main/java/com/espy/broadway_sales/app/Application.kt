package com.espy.broadway_sales.app

import android.app.Application
import android.content.Context
import com.espy.broadway_sales.app.AppSettings.Companion.APP_PREF
import com.espy.broadway_sales.db.DatabaseProvider
import com.espy.broadway_sales.preference.PreferenceProvider

private lateinit var appContext: Context

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        DatabaseProvider().initDb(appContext)
        PreferenceProvider.init(appContext, APP_PREF)
    }
}