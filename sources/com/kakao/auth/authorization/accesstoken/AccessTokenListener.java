package com.kakao.auth.authorization.accesstoken;

import com.kakao.network.ErrorResult;

public interface AccessTokenListener {
    void onAccessTokenFailure(ErrorResult errorResult);

    void onAccessTokenReceived(AccessToken accessToken);
}
