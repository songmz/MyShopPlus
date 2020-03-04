package com.songmz.myshop.plus.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>Title BusinessOAuth2Application</p>
 * <p>Description:</p>
 * 
 * @author songmz
 * @date 2020/3/3 15:15
 * @see com.songmz.myshop.plus.business
*/
@EnableDiscoveryClient
@EnableFeignClients
//@SpringBootApplication(scanBasePackageClasses = {BusinessOAuth2Application.class}, scanBasePackages = "com.songmz.myshop.plus.cloud.feign")
@SpringBootApplication(scanBasePackageClasses = {BusinessOAuth2Application.class})
public class BusinessOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(BusinessOAuth2Application.class, args);
    }

}
