package com.espy.broadway_sales.api.models.login

import com.espy.broadway_sales.api.models.ResponseBase
import kotlinx.serialization.SerialName

class LoginResponse(
    @SerialName("data")
    var data: String? = ""
) : ResponseBase()