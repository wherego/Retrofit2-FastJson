package com.lichfaker.lib.converter;

import com.alibaba.fastjson.JSON;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;
import java.nio.charset.Charset;

import retrofit.Converter;

/**
 * @author LichFaker on 15/12/28.
 * @Email lichfaker@gmail.com
 */
public class FastJsonRequestBodyConverter<T> implements Converter<T, RequestBody> {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

    @Override
    public RequestBody convert(T value) throws IOException {
        return RequestBody.create(MEDIA_TYPE, JSON.toJSONString(value).getBytes(UTF_8));
    }

}
