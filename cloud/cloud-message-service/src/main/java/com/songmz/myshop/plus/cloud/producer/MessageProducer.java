package com.songmz.myshop.plus.cloud.producer;

import com.songmz.myshop.plus.cloud.api.MessageService;
import com.songmz.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.songmz.myshop.plus.cloud.message.MessageSource;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>消息生产者.</p>
 * <p>Description: 该类使用的两个注解表示其即是Dubbo服务，又是http服务</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.producer
 */
@Component
@Service(version = "1.0.0")
public class MessageProducer implements MessageService {

    @Resource
    private MessageSource source;

    /**
     * 管理登录日志
     *
     * @param dto {@link UmsAdminLoginLogDTO}
     * @return {@code boolean}
     */
    @Override
    public boolean sendAdminLoginLog(UmsAdminLoginLogDTO dto) {
        return source.adminLoginLog().send(MessageBuilder.withPayload(dto).build());
    }
}
