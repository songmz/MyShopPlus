package com.songmz.myshop.plus.business.feign.fallback;

import com.songmz.myshop.plus.business.dto.params.IconParam;
import com.songmz.myshop.plus.business.dto.params.PasswordParam;
import com.songmz.myshop.plus.business.dto.params.ProfileParam;
import com.songmz.myshop.plus.business.feign.ProfileFeign;
import com.songmz.myshop.plus.commons.dto.ResponseResult;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import org.springframework.stereotype.Component;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/4
 * @see com.songmz.myshop.plus.business.feign.fallback
 */
@Component
public class ProfileFeignFallback implements ProfileFeign {

    public static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String info(String username) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String update(ProfileParam profileParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyPassword(PasswordParam passwordParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String modifyIcon(IconParam iconParam) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
