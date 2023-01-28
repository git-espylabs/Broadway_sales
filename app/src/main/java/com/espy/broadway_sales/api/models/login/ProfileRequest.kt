package com.espy.broadway_sales.api.models.login

import com.google.gson.annotations.SerializedName

data class ProfileRequest(
    @SerializedName("staff_login_id")
    var staff_login_id: String = ""
)
