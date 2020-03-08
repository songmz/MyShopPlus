package com.songmz.myshop.plus.cloud.api;

import com.songmz.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.api
 */
public interface MessageService {

    boolean sendAdminLoginLog(UmsAdminLoginLogDTO umsAdminLoginLogDTO);

}
