package com.songmz.myshop.plus.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>修改头像参数.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/4
 * @see com.songmz.myshop.plus.business.dto.params
 */
@Data
public class IconParam implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
