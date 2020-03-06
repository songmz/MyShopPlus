package com.songmz.myshop.plus.business.tests;

import com.songmz.myshop.plus.business.dto.params.ProfileParam;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import org.junit.Test;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/6
 * @see com.songmz.myshop.plus.business.tests
 */
public class PrintJsonTests {

    @Test
    public void testPrintProfileParam() throws Exception {
        System.out.println(MapperUtils.obj2json(new ProfileParam()));
    }
}
