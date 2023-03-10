package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class ShopCollectionHistoryRequest(
    @SerializedName("shopid")
    var shopid: String = "",
    @SerializedName("from")
    var from: String = "",
    @SerializedName("to")
    var to: String = ""
)
