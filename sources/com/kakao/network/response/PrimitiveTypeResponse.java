package com.kakao.network.response;

import com.kakao.network.response.ResponseBody.ResponseBodyException;

public class PrimitiveTypeResponse {
    protected PrimitiveTypeResponse(ResponseData responseData) throws ResponseBodyException, ApiResponseStatusError {
    }

    protected PrimitiveTypeResponse(String str) {
    }
}
