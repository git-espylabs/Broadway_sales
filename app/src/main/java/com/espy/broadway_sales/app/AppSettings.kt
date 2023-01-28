package com.espy.broadway_sales.app

import com.espy.broadway_sales.api.HttpEndPoints
import com.espy.broadway_sales.api.header.NetworkRequestHeader

internal class AppSettings {

    companion object{
        const val APP_PREF = "com.espy.broadway_sales"

        const val CACHED_DB_PATH = "database/broadway_sales_config_db.db"
        const val DB_NAME = "broadway_salesapp.db"

        const val NETWORK_READ_TIME_OUT = 30 * 1000
        const val NETWORK_CONNECTION_TIME_OUT = 10 * 1000

        const val CLENSA_FILE_PROVIDER = "fileprovider"

        val endPoints = HttpEndPoints

        val cacheControl = NetworkRequestHeader("Cache-Control", "no-cache")
        val contentType = NetworkRequestHeader("Content-Type", "application/json")
    }
}