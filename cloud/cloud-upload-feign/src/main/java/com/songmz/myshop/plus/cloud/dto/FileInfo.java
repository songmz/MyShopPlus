package com.songmz.myshop.plus.cloud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>文件信息.</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/6
 * @see com.songmz.myshop.plus.cloud.dto
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileInfo implements Serializable {
    /**
     * 文件路径
     */
    private String path;
}
