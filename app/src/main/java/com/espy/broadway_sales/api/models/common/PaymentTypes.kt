package com.espy.broadway_sales.api.models.common

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class PaymentTypes(
    @SerialName("data")
    var data: List<PaymentType> = listOf()
) : ResponseBase()
