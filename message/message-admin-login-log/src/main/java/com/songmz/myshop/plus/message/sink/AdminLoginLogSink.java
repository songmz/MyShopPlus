package com.songmz.myshop.plus.message.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.message.sink
 */
public interface AdminLoginLogSink {

    @Input("admin-login-log-topic")
    SubscribableChannel adminLoginLog();

}
