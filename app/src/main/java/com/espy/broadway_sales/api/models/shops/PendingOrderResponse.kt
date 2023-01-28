package com.espy.broadway_sales.api.models.shops

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class PendingOrderResponse(
    @SerialName("data")
    var data: List<PendingOrder>?
) : ResponseBase()
