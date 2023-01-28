package com.espy.broadway_sales.api.models.order

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

class OrderResponse(
    @SerialName("data")
    var data: String? = ""
) : ResponseBase()