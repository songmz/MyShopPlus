package com.songmz.myshop.plus.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.songmz.myshop.plus.provider.mapper")
@SpringBootApplication
public class ProviderAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminApplication.class, args);
    }
}
