package com.espy.broadway_sales.api.models.products

import com.google.gson.annotations.SerializedName

data class ProductImageRequest(
    @SerializedName("product_id")
    var product_id: String = ""
)