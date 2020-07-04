package com.kakao.auth.api;

import android.content.Context;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenRequest;
import com.kakao.auth.network.AuthNetworkService;
import com.kakao.auth.network.AuthNetworkService.Factory;
import com.kakao.auth.network.request.AccessTokenInfoRequest;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.auth.network.response.AuthResponseError;
import com.kakao.network.IRequest;
import com.kakao.network.NetworkService;
import com.kakao.util.KakaoUtilService;

public class AuthApi {
    private static AuthApi instance = new AuthApi(Factory.getInstance(), NetworkService.Factory.getInstance());
    private AuthNetworkService authNetworkService;
    private NetworkService networkService;

    public static AuthApi getInstance() {
        return instance;
    }

    public AccessTokenInfoResponse requestAccessTokenInfo() throws Exception {
        return (AccessTokenInfoResponse) this.authNetworkService.request(new AccessTokenInfoRequest(), AccessTokenInfoResponse.CONVERTER);
    }

    public AuthApi(AuthNetworkService authNetworkService2, NetworkService networkService2) {
        this.authNetworkService = authNetworkService2;
        this.networkService = networkService2;
    }

    public AccessToken requestAccessToken(Context context, String str, String str2, String str3) throws Exception {
        return (AccessToken) this.networkService.request((IRequest) new AccessTokenRequest(KakaoUtilService.Factory.getInstance().getAppConfiguration(context), str, str2, str3), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER);
    }
}
