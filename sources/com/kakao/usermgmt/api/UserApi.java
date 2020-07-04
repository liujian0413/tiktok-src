package com.kakao.usermgmt.api;

import com.kakao.auth.AuthService.AgeLimit;
import com.kakao.auth.network.AuthNetworkService;
import com.kakao.auth.network.AuthNetworkService.Factory;
import com.kakao.usermgmt.request.AgeAuthRequest;
import com.kakao.usermgmt.request.LogoutRequest;
import com.kakao.usermgmt.request.MeRequest;
import com.kakao.usermgmt.request.MeV2Request;
import com.kakao.usermgmt.request.SignupRequest;
import com.kakao.usermgmt.request.UnlinkRequest;
import com.kakao.usermgmt.request.UpdateProfileRequest;
import com.kakao.usermgmt.response.AgeAuthResponse;
import com.kakao.usermgmt.response.MeResponse;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.UserResponse;
import com.kakao.usermgmt.response.model.UserProfile;
import java.util.List;
import java.util.Map;

public class UserApi {
    private static UserApi instance = new UserApi(Factory.getInstance());
    private AuthNetworkService networkService;

    public static UserApi getInstance() {
        return instance;
    }

    public Long requestLogout() throws Exception {
        return (Long) this.networkService.request(new LogoutRequest(), UserResponse.CONVERTER);
    }

    public Long requestUnlink() throws Exception {
        return (Long) this.networkService.request(new UnlinkRequest(), UserResponse.CONVERTER);
    }

    UserApi(AuthNetworkService authNetworkService) {
        this.networkService = authNetworkService;
    }

    public Long requestSignup(Map<String, String> map) throws Exception {
        return (Long) this.networkService.request(new SignupRequest(map), UserResponse.CONVERTER);
    }

    public Long requestUpdateProfile(Map<String, String> map) throws Exception {
        return (Long) this.networkService.request(new UpdateProfileRequest(map), UserResponse.CONVERTER);
    }

    /* renamed from: me */
    public MeV2Response mo48471me(List<String> list, Boolean bool) throws Exception {
        return (MeV2Response) this.networkService.request(new MeV2Request(list, bool.booleanValue()), MeV2Response.CONVERTER);
    }

    public AgeAuthResponse requestAgeAuthInfo(AgeLimit ageLimit, List<String> list) throws Exception {
        String str;
        if (ageLimit != null) {
            str = ageLimit.getValue();
        } else {
            str = null;
        }
        return (AgeAuthResponse) this.networkService.request(new AgeAuthRequest(str, list), AgeAuthResponse.CONVERTER);
    }

    public UserProfile requestMe(List<String> list, Boolean bool) throws Exception {
        return (UserProfile) this.networkService.request(new MeRequest(list, bool.booleanValue()), MeResponse.CONVERTER);
    }
}
