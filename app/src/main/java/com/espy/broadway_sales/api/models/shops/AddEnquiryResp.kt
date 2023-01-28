package com.espy.broadway_sales.api.models.shops

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class AddEnquiryResp(
    @SerialName("data")
    var data: Int?=0
) : ResponseBase()
