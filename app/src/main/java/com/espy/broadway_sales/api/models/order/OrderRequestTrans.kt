package com.espy.broadway_sales.api.models.order

import com.google.gson.annotations.SerializedName

data class OrderRequestTrans(
    @SerializedName("batchid")
    var batchid: String = "1",
    @SerializedName("qty")
    var qty: String = "0",
    @SerializedName("totqtyamount")
    var totqtyamount: String = "0",
    @SerializedName("unitprice")
    var unitprice: String = "0"
)
