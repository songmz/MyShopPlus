package com.songmz.myshop.plus.business.controller.fallback;

import com.songmz.myshop.plus.business.dto.UmsAdminDTO;
import com.songmz.myshop.plus.business.feign.fallback.ProfileFeignFallback;
import com.songmz.myshop.plus.commons.dto.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/4
 * @see com.songmz.myshop.plus.business.controller.fallback
 */
public class ProfileControllerFallback {

    private static final Logger logger = LoggerFactory.getLogger(ProfileControllerFallback.class);

    /**
     * 熔断方法
     *
     * @param username {@code String} 用户名
     * @return {@link ResponseResult<UmsAdminDTO>}
     */
    public static ResponseResult<UmsAdminDTO> infoFallback(String username, Throwable ex) {
        logger.warn("Invoke infoFallback: " + ex.getClass().getTypeName());
        ex.printStackTrace();
        return new ResponseResult<UmsAdminDTO>(ResponseResult.CodeStatus.BREAKING, ProfileFeignFallback.BREAKING_MESSAGE);
    }

}
