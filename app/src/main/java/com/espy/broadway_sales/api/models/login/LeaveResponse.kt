package com.espy.broadway_sales.api.models.login

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class LeaveResponse(
    @SerialName("data")
    var data: String? = ""
) : ResponseBase()