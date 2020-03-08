package com.songmz.myshop.plus.cloud.controller;

import com.songmz.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.songmz.myshop.plus.cloud.producer.MessageProducer;
import com.songmz.myshop.plus.commons.dto.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.controller
 */
@RestController
@RequestMapping(value = "message")
public class MessageController {

    @Resource
    private MessageProducer messageProducer;

    @PostMapping(value = "admin/login/log")
    public ResponseResult<Void> sendAdminLoginLog(@RequestBody UmsAdminLoginLogDTO dto) {
        boolean flag = messageProducer.sendAdminLoginLog(dto);

        if(flag) {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "发送管理员登录日志成功");
        }

        else {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "发送管理员登录日志失败");
        }
    }
}
