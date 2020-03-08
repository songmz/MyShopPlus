package com.songmz.myshop.plus.message.consumer;

import com.songmz.myshop.plus.commons.utils.MapperUtils;
import com.songmz.myshop.plus.provider.api.UmsAdminLoginLogService;
import com.songmz.myshop.plus.provider.domain.UmsAdminLoginLog;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.message.consumer
 */
@Service
public class AdminLoginLogReceive {

    @Reference(version = "1.0.0")
    private UmsAdminLoginLogService umsAdminLoginLogService;

    @StreamListener("admin-login-log-topic")
    public void receiveAdminLoginLog(String umsAdminLoginLogJson) throws Exception {
        UmsAdminLoginLog umsAdminLoginLog = MapperUtils.json2pojo(umsAdminLoginLogJson, UmsAdminLoginLog.class);
        umsAdminLoginLogService.insert(umsAdminLoginLog);
    }

}
