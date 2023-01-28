package com.espy.broadway_sales.api.models

import kotlinx.serialization.SerialName

data class TempResponse(
    @SerialName("data")
    var data: Int? = 0
) : ResponseBase()