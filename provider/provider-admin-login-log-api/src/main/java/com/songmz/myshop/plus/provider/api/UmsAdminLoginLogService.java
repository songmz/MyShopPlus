package com.songmz.myshop.plus.provider.api;

import com.songmz.myshop.plus.provider.domain.UmsAdminLoginLog;

/**
 * <p>系统登录日志服务.</p>
 * <p>Description:</p>
 * 
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.provider.api
*/
public interface UmsAdminLoginLogService {

        /**
         * 新增日志
         *
         * @param umsAdminLoginLog {@link UmsAdminLoginLog}
         * @return {@code int} 大于 0 则表示添加成功
         */
        int insert(UmsAdminLoginLog umsAdminLoginLog);
}
