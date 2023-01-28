package com.espy.broadway_sales.api.models.products

import kotlinx.serialization.SerialName

data class ProductImage(
    @SerialName("image")
    var image: String? = ""
)
