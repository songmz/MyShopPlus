package com.songmz.myshop.plus.business.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>登录参数.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/3
 * @see com.songmz.myshop.plus.business.dto
 */
@Data
public class LoginParam implements Serializable {

    private String username;
    private String password;

}
