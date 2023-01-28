package com.espy.broadway_sales.api.models.shops

import com.google.gson.annotations.SerializedName

data class CreateAppointmentDataRequest(
    @SerializedName("agency_id")
    var agency_id: String = "",

    @SerializedName("staff_login_id")
    var staff_login_id: String = "",

    @SerializedName("next_meet_date")
    var next_meet_date: String = "",

    @SerializedName("product")
    var product: String = "",

    @SerializedName("description")
    var description: String = "",

    @SerializedName("meeting_status")
    var meeting_status: String = ""
)
