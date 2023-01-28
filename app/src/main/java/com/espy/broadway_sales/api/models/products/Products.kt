package com.espy.broadway_sales.api.models.products

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class Products(
    @SerialName("data")
    var data: List<Product> = listOf()
) : ResponseBase()
