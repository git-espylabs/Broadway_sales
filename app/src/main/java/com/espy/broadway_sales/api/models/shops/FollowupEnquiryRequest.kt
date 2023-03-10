package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class FollowupEnquiryRequest(
    @SerializedName("agency_id")
    var agency_id: String = "",
    @SerializedName("enquiry_id")
    var enquiry_id: String = "",
    @SerializedName("followup_date")
    var followup_date: String = "",
    @SerializedName("confirm_chance")
    var confirm_chance: String = "",
    /*@SerializedName("amendment_replied_date")
    var amendment_replied_date: String = "",*/
    @SerializedName("notes")
    var notes: String = ""
)
