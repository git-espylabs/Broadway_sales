package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class OrderItemRequest(
    @SerializedName("order_id")
    var order_id: String = ""
)