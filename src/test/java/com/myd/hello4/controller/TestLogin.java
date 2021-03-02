package com.myd.hello4.controller;

import com.alibaba.fastjson.JSON;
import com.myd.hello4.dto.User;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/2 10:08
 * @Description:
 */
@SpringBootTest
public class TestLogin {

    public static final String URL = "http://127.0.0.1:8084/";

    @Test
    public void test1() throws IOException {
        String urlTeml = URL+ "login";

        User user = new User();
        user.setName("Tom");
        user.setPhone("13609876543");
        user.setAge(10);

        System.out.println(JSON.toJSONString(user));

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,JSON.toJSONString(user));
        Request request = new Request.Builder()
                .url(urlTeml)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Cache-Control", "no-cache")
                .build();
        Response response = client.newCall(request).
                execute();
        String string = response.body().string();

        System.out.println(string);

    }


}
