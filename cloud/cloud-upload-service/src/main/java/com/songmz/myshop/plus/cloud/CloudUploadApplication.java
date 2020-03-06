package com.songmz.myshop.plus.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/6
 * @see com.songmz.myshop.plus.cloud
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudUploadApplication.class, args);
    }

}
