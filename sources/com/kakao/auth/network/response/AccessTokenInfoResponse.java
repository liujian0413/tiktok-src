package com.kakao.auth.network.response;

import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseData;
import com.kakao.network.response.ResponseStringConverter;

public class AccessTokenInfoResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<AccessTokenInfoResponse> CONVERTER = new ResponseStringConverter<AccessTokenInfoResponse>() {
        public final AccessTokenInfoResponse convert(String str) throws ResponseBodyException {
            return new AccessTokenInfoResponse(str);
        }
    };
    private final long expiresInMillis = getBody().getLong("expiresInMillis");
    private final long userId = getBody().getLong("id");

    public long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public long getUserId() {
        return this.userId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessTokenInfoResponse{userId=");
        sb.append(this.userId);
        sb.append(", expiresInMillis=");
        sb.append(this.expiresInMillis);
        sb.append('}');
        return sb.toString();
    }

    public AccessTokenInfoResponse(ResponseData responseData) throws ResponseBodyException, ApiResponseStatusError {
        super(responseData);
    }

    public AccessTokenInfoResponse(String str) throws ResponseBodyException {
        super(str);
    }
}
