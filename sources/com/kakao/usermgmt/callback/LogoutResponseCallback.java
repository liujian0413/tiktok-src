package com.kakao.usermgmt.callback;

import com.kakao.auth.ApiResponseCallback;
import com.kakao.network.ErrorResult;

public abstract class LogoutResponseCallback extends ApiResponseCallback<Long> {
    public abstract void onCompleteLogout();

    public void onDidEnd() {
        onCompleteLogout();
    }

    public void onNotSignedUp() {
    }

    public void onSessionClosed(ErrorResult errorResult) {
    }

    public void onSuccess(Long l) {
    }
}
