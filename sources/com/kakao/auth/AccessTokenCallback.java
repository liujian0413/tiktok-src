package com.kakao.auth;

import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenListener;
import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;

public abstract class AccessTokenCallback extends ResponseCallback<AccessToken> implements AccessTokenListener {
    public final void onDidEnd() {
        super.onDidEnd();
    }

    public final void onDidStart() {
        super.onDidStart();
    }

    public final void onFailure(ErrorResult errorResult) {
        onAccessTokenFailure(errorResult);
    }

    public final void onFailureForUiThread(ErrorResult errorResult) {
        super.onFailureForUiThread(errorResult);
    }

    public final void onSuccessForUiThread(AccessToken accessToken) {
        super.onSuccessForUiThread(accessToken);
    }

    public final void onSuccess(AccessToken accessToken) {
        if (accessToken.hasValidAccessToken()) {
            onAccessTokenReceived(accessToken);
        } else {
            onAccessTokenFailure(new ErrorResult((Exception) new KakaoException(ErrorType.AUTHORIZATION_FAILED, "the result of access token request is invalid access token.")));
        }
    }
}
