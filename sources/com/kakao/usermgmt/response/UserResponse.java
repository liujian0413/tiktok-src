package com.kakao.usermgmt.response;

import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;

public class UserResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<Long> CONVERTER = new ResponseStringConverter<Long>() {
        public final Long convert(String str) throws ResponseBodyException {
            return Long.valueOf(new UserResponse(str).getUserId());
        }
    };
    private final long userId = getBody().getLong("id");

    public long getUserId() {
        return this.userId;
    }

    UserResponse(String str) throws ResponseBodyException {
        super(str);
        if (this.userId <= 0) {
            throw new ResponseBodyException("User is called but the result user is null.");
        }
    }
}
