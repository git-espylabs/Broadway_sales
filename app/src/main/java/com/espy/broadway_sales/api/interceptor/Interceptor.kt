package com.espy.broadway_sales.api.interceptor

import okhttp3.Interceptor

interface Interceptor {

    /**
     * Get interceptors
     */
    fun interceptors(): List<Interceptor>
}