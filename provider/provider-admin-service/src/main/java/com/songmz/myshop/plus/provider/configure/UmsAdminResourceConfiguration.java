package com.songmz.myshop.plus.provider.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * <p>Description</p>
 *
 * @author songmz
 * @date 2020/3/2
 */
@Configuration
public class UmsAdminResourceConfiguration {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
