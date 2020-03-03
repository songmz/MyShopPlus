package com.songmz.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>登录信息.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/3
 * @see com.songmz.myshop.plus.business.dto
 */
@Data
public class LoginInfo implements Serializable {
    private String name;
    private String avatar;
    private String nickName;
}
