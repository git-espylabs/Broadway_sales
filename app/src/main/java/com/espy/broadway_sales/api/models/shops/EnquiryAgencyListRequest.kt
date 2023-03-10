package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class EnquiryAgencyListRequest(

    @SerializedName("exe_id")
    var exe_id: String = "",
    @SerializedName("from_date")
    var from_date: String = "",
    @SerializedName("to_date")
    var to_date: String = ""
)
