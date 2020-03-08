package com.songmz.myshop.plus.message;

import com.songmz.myshop.plus.message.sink.AdminLoginLogSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.message
 */
@SpringBootApplication
@EnableBinding({AdminLoginLogSink.class})
public class MessageAdminLoginLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageAdminLoginLogApplication.class, args);
    }

}
