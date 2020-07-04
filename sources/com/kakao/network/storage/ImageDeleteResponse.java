package com.kakao.network.storage;

import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;

public class ImageDeleteResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<ImageDeleteResponse> CONVERTER = new ResponseStringConverter<ImageDeleteResponse>() {
        public final ImageDeleteResponse convert(String str) throws ResponseBodyException {
            return new ImageDeleteResponse(str);
        }
    };

    public ImageDeleteResponse(String str) {
        super(str);
    }
}
