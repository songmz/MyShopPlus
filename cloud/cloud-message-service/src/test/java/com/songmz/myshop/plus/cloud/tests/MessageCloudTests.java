package com.songmz.myshop.plus.cloud.tests;

import com.songmz.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/8
 * @see com.songmz.myshop.plus.cloud.tests
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageCloudTests {

    @Test
    public void testPrintln() throws Exception {
        UmsAdminLoginLogDTO dto = new UmsAdminLoginLogDTO();
        dto.setAdminId(1L);
        dto.setCreateTime(new Date());
        dto.setIp("0.0.0.0");
        dto.setAddress("0.0.0.0");
        dto.setUserAgent("0.0.0.0");
        System.out.println(MapperUtils.obj2json(dto));
    }

}
