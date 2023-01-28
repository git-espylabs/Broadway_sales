package com.espy.broadway_sales.api.models.products

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class ProductStockResponse(
    @SerialName("data")
    var data: List<ProductStock> = listOf()
) : ResponseBase()