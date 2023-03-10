package com.espy.broadway_sales.api.models.login

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("username")
    var username: String = "",
    @SerializedName("password")
    var password: String = ""
)
