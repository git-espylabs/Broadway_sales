package com.espy.broadway_sales.api.models.common

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class ExpenseTypes(
    @SerialName("data")
    var data: List<ExpenseType> = listOf()
) : ResponseBase()
