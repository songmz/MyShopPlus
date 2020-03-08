package com.songmz.myshop.plus.cloud.feign.fallback;

import com.songmz.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.songmz.myshop.plus.cloud.feign.MessageFeign;
import com.songmz.myshop.plus.commons.dto.ResponseResult;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import org.springframework.stereotype.Component;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.feign.fallback
 */
@Component
public class MessageFeignFallback implements MessageFeign {

    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    /**
     * 作废
     * @param dto
     * @return
     * @see com.songmz.myshop.plus.cloud.controller.MessageController
     */
//    @Override
//    public String sendAdminLoginLog(UmsAdminLoginLogDTO dto) {
//        try {
//            MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
