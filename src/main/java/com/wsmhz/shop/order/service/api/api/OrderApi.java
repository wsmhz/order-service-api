package com.wsmhz.shop.order.service.api.api;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created By TangBiJing On 2019/5/16
 * Description:
 */
@FeignClient("order-service")
public interface OrderApi {

}
