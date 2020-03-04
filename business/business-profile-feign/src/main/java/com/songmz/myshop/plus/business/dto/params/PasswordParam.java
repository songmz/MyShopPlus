package com.songmz.myshop.plus.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>修改密码参数.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/4
 * @see com.songmz.myshop.plus.business.dto.params
 */
@Data
public class PasswordParam implements Serializable {

    private String username;
    private String oldPassword;
    private String newPassword;

}
