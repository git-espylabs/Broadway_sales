package com.espy.broadway_sales.api.models.products

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class ProductImageResponse(
    @SerialName("data")
    var data: List<ProductImage> = listOf()
) : ResponseBase()
