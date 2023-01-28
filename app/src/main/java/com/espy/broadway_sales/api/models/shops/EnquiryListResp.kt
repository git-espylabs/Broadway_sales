package com.espy.broadway_sales.api.models.shops

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

data class EnquiryListResp(
    @SerialName("data")
    var data: List<EnquiryItem>
) : ResponseBase()
