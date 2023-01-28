package com.espy.broadway_sales.api.models.products

import com.google.gson.annotations.SerializedName

data class TodayMyOrderRequest(
    @SerializedName("staffid")
    var staffid: String = ""
)
