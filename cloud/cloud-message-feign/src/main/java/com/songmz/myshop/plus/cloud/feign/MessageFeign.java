package com.songmz.myshop.plus.cloud.feign;

import com.songmz.myshop.plus.cloud.feign.fallback.MessageFeignFallback;
import com.songmz.myshop.plus.configuration.FeignRequestConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.feign
 */
@FeignClient(value = "cloud-message", path = "message", configuration = FeignRequestConfiguration.class, fallback = MessageFeignFallback.class)
public interface MessageFeign {

    /**
     * 作废
     * @param dto
     * @return
     * @see com.songmz.myshop.plus.cloud.controller.MessageController
     */
//    @PostMapping(value = "admin/login/log")
//    String sendAdminLoginLog(@RequestBody UmsAdminLoginLogDTO dto);
}
