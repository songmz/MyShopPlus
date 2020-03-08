package com.songmz.myshop.plus.cloud.feign.fallback;

import com.songmz.myshop.plus.cloud.feign.MessageFeign;
import org.springframework.stereotype.Component;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.feign.fallback
 */
@Component
public class MessageFeignFallback implements MessageFeign {

    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

}
