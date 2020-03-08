package com.songmz.myshop.plus.cloud.controller;

import com.songmz.myshop.plus.cloud.producer.MessageProducer;
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

    /**
     * 这种方式只支持http调用(Restful)，但在登录的时候不方便把token带过来，所以改造一下，让其即可以rpc调用(无需token)，又可以http调用(带上token)
     * 改造后靠 cloud-message-api 实现
     * @param dto
     * @return
     */
//    @PostMapping(value = "admin/login/log")
//    public ResponseResult<Void> sendAdminLoginLog(@RequestBody UmsAdminLoginLogDTO dto) {
//        boolean flag = messageProducer.sendAdminLoginLog(dto);
//
//        if(flag) {
//            return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "发送管理员登录日志成功");
//        }
//
//        else {
//            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "发送管理员登录日志失败");
//        }
//    }
}
