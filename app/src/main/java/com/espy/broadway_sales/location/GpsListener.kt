package com.espy.broadway_sales.location

import android.location.Location

interface GpsListener {
    fun onLocationUpdate(location: Location?)
    fun onLocationDisabled()
}