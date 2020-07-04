package com.kakao.usermgmt.response;

import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseData;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.usermgmt.response.model.UserProfile;

public class MeResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<UserProfile> CONVERTER = new ResponseStringConverter<UserProfile>() {
        public final UserProfile convert(String str) throws ResponseBodyException, ApiResponseStatusError {
            return new MeResponse(str).getUserProfile();
        }
    };
    private final UserProfile userProfile = new UserProfile(getBody());

    public UserProfile getUserProfile() {
        return this.userProfile;
    }

    MeResponse(ResponseData responseData) throws ResponseBodyException, ApiResponseStatusError {
        super(responseData);
    }

    MeResponse(String str) {
        super(str);
    }
}
