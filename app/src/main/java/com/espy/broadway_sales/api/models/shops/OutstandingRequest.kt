package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class OutstandingRequest(
    @SerializedName("shop_id")
    var shop_id: String = ""
)
