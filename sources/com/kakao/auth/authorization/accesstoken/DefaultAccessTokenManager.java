package com.kakao.auth.authorization.accesstoken;

import com.kakao.auth.AccessTokenCallback;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.authorization.accesstoken.AccessToken.Factory;
import com.kakao.auth.network.request.AccessTokenInfoRequest;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.auth.network.response.AuthResponseError;
import com.kakao.network.IRequest;
import com.kakao.network.NetworkService;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.util.IConfiguration;
import java.util.concurrent.Future;

class DefaultAccessTokenManager implements AccessTokenManager {
    private ApprovalType approvalType;
    private IConfiguration configuration;
    private NetworkService networkService;

    public Future<AccessTokenInfoResponse> requestAccessTokenInfo(ApiResponseCallback<AccessTokenInfoResponse> apiResponseCallback) {
        return this.networkService.request((IRequest) new AccessTokenInfoRequest(), AccessTokenInfoResponse.CONVERTER, (ResponseCallback<T>) apiResponseCallback);
    }

    public synchronized Future<AccessToken> refreshAccessToken(String str, AccessTokenCallback accessTokenCallback) {
        return this.networkService.request(new AccessTokenRequest(this.configuration, null, str, this.approvalType.toString()), Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
    }

    public Future<AccessToken> requestAccessTokenByAuthCode(String str, AccessTokenCallback accessTokenCallback) {
        return this.networkService.request(new AccessTokenRequest(this.configuration, str, null, this.approvalType.toString()), Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
    }

    DefaultAccessTokenManager(IConfiguration iConfiguration, NetworkService networkService2, ApprovalType approvalType2) {
        this.configuration = iConfiguration;
        this.networkService = networkService2;
        this.approvalType = approvalType2;
    }
}
