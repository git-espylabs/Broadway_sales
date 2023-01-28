package com.espy.broadway_sales.api.services

import com.espy.broadway_sales.api.HttpEndPoints
import com.espy.broadway_sales.api.models.order.OrderRequestMaster
import com.espy.broadway_sales.api.models.order.OrderResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

interface OrderApiInterface {

    @POST(HttpEndPoints.CLENSA_ORDER_POST)
    fun uploadOrderAsync(
        @Body orderRequestMaster: OrderRequestMaster
    ): Deferred<OrderResponse>
}