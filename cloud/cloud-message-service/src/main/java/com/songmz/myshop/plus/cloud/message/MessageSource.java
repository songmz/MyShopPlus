package com.songmz.myshop.plus.cloud.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.message
 */
public interface MessageSource {

    @Output("admin-login-log-topic")
    MessageChannel adminLoginLog();

}
