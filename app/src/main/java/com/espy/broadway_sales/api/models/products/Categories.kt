package com.espy.broadway_sales.api.models.products

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class Categories(
    @SerialName("data")
    var data: List<Category> = listOf()
) : ResponseBase()
