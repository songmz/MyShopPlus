package com.songmz.myshop.plus.business;

import com.google.common.collect.Maps;
import com.songmz.myshop.plus.commons.utils.MapperUtils;
import com.songmz.myshop.plus.commons.utils.OkHttpClientUtil;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Map;

/**
 * <p>Title</p>
 * <p>Description:</p>
 *
 * @author songmz
 * @date 2020/3/4
 * @see com.songmz.myshop.plus.business
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OKHttp3Tests {

    @Test
    public void testGet() {
        String url = "https://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPost() {
        String url = "http://localhost:9001/oauth/token";
        OkHttpClient client = new OkHttpClient();
        RequestBody body = new FormBody.Builder()
                .add("username", "admin")
                .add("password", "123456")
                .add("grant_type", "password")
                .add("client_id", "client")
                .add("client_secret", "secret")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUtilPort() {
        String url = "http://localhost:9001/oauth/token";
        Map<String, String> params = Maps.newHashMap();
        params.put("username", "admin");
        params.put("password", "123456");
        params.put("grant_type", "password");
        params.put("client_id", "client");
        params.put("client_secret", "secret");

        Response response = OkHttpClientUtil.getInstance().postData(url, params);
        try {
            String jsonStr = response.body().string();
            Map<String, Object> jsonMap = MapperUtils.json2map(jsonStr);
            String token = String.valueOf(jsonMap.get("access_token"));
            System.out.println(token);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testAsyncGet() {
        String url = "https://www.baidu.com";
        OkHttpClientUtil.getInstance().getDataAsync(url, new OkHttpClientUtil.MyNetCall() {
            @Override
            public void success(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
            }

            @Override
            public void failed(Call call, IOException e) {
                e.printStackTrace();
            }
        });

        // 直接异步请求看不出效果，等待 5 秒
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
