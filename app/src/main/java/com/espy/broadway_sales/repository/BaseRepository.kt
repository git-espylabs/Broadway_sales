@file:Suppress("unused")

package com.espy.broadway_sales.repository

abstract class BaseRepository {

    open val TAG = "BaseRepo"

    private var stringBuilder = StringBuilder()

    abstract fun onCleared()

    private fun clear() {
        stringBuilder.clear()
    }
}