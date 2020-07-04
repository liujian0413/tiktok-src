package com.kakao.auth.authorization.accesstoken;

import android.content.Context;
import com.kakao.auth.AccessTokenCallback;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import java.util.concurrent.Future;

public interface AccessTokenManager {

    public static class Factory {
        private static AccessTokenManager accessTokenManager;

        public static AccessTokenManager getInstance() {
            return accessTokenManager;
        }

        public static AccessTokenManager initialize(Context context, ApprovalType approvalType) {
            if (accessTokenManager == null) {
                accessTokenManager = new DefaultAccessTokenManager(com.kakao.util.KakaoUtilService.Factory.getInstance().getAppConfiguration(KakaoSDK.getAdapter().getApplicationConfig().getApplicationContext()), com.kakao.network.NetworkService.Factory.getInstance(), approvalType);
            }
            return accessTokenManager;
        }
    }

    Future<AccessToken> refreshAccessToken(String str, AccessTokenCallback accessTokenCallback);

    Future<AccessToken> requestAccessTokenByAuthCode(String str, AccessTokenCallback accessTokenCallback);

    Future<AccessTokenInfoResponse> requestAccessTokenInfo(ApiResponseCallback<AccessTokenInfoResponse> apiResponseCallback);
}
