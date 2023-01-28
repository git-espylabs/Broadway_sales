package com.espy.broadway_sales.api.models.products

import com.espy.broadway_sales.api.models.ResponseBase
import com.espy.broadway_sales.ui.products.models.TodayMyOrder
import kotlinx.serialization.SerialName

data class TodayMyOrdersResp(
    @SerialName("data")
    var data: List<TodayMyOrder>
) : ResponseBase()
