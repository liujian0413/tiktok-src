package com.kakao.network.response;

import com.kakao.network.response.ResponseBody.ResponseBodyException;

public class JSONObjectResponse {
    private ResponseBody body;

    protected JSONObjectResponse() {
    }

    /* access modifiers changed from: protected */
    public ResponseBody getBody() {
        return this.body;
    }

    protected JSONObjectResponse(ResponseBody responseBody) throws ResponseBodyException {
        this.body = responseBody;
    }

    protected JSONObjectResponse(ResponseData responseData) throws ResponseBodyException {
        this(new String(responseData.getData()));
    }

    protected JSONObjectResponse(String str) {
        this.body = new ResponseBody(str);
    }
}
