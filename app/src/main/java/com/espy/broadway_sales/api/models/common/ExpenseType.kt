package com.espy.broadway_sales.api.models.common

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName

@Parcelize
data class ExpenseType(
    @SerialName("id")
    var id: String? = "",
    @SerialName("type_name")
    var type_name: String? = ""
): Parcelable {
    override fun toString(): String {
        return type_name.toString()
    }
}