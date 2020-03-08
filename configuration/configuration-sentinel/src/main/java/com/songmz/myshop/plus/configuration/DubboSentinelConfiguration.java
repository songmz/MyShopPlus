package com.songmz.myshop.plus.configuration;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Dubbo Sentinel AOP.</p>
 * <p>Description: 仅 Dubbo 服务需要该配置，Spring Cloud Alibaba 无需加载该配置</p>
 *
 * @author songmz
 * @date 2020/3/6
 * @see com.songmz.myshop.plus.configuration
 */
@Configuration
public class DubboSentinelConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
