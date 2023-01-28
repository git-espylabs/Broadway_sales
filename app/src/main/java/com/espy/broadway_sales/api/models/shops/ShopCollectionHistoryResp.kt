package com.espy.broadway_sales.api.models.shops

import com.espy.broadway_sales.api.models.ResponseBase
import com.espy.broadway_sales.ui.shops.models.ShopPayHistory
import kotlinx.serialization.SerialName

data class ShopCollectionHistoryResp(
    @SerialName("data")
    var data: List<ShopPayHistory>
) : ResponseBase()
