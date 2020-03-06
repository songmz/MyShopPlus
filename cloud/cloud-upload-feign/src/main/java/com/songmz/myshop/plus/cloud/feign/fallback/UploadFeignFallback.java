package com.songmz.myshop.plus.cloud.feign.fallback;

import com.songmz.myshop.plus.cloud.feign.UploadFeign;
import com.songmz.myshop.plus.commons.dto.ResponseResult;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>文件上传熔断器.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/6
 * @see com.songmz.myshop.plus.cloud.feign.fallback
 */
@Component
public class UploadFeignFallback implements UploadFeign {

    private static final String BREAKING_MESSAGE = "请求失败了，请检查您的网络";

    @Override
    public String upload(MultipartFile multipartFile) {
        try {
            return MapperUtils.obj2json(new ResponseResult<Void>(ResponseResult.CodeStatus.BREAKING, BREAKING_MESSAGE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
