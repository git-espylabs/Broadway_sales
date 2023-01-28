package com.espy.broadway_sales.api.models.products

import com.google.gson.annotations.SerializedName

data class ProductStockRequest(
    @SerializedName("batchid")
    var batchid: String = ""
)