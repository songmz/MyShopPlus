package com.songmz.myshop.plus.cloud;

import com.songmz.myshop.plus.cloud.message.MessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({MessageSource.class})
public class CloudMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMessageApplication.class, args);
    }
}
