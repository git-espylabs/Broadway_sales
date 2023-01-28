package com.espy.broadway_sales.api.models.shops

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class Routes(
    @SerialName("data")
    var data: List<Route>
) : ResponseBase()
