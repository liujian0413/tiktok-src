package com.kakao.auth;

import com.kakao.network.ErrorResult;
import com.kakao.network.callback.ResponseCallback;

public abstract class ApiResponseCallback<T> extends ResponseCallback<T> {
    public void onFailure(ErrorResult errorResult) {
    }

    public abstract void onNotSignedUp();

    public abstract void onSessionClosed(ErrorResult errorResult);

    public void onFailureForUiThread(ErrorResult errorResult) {
        int errorCode = errorResult.getErrorCode();
        if (errorCode == -101) {
            onNotSignedUp();
        } else if (errorCode == -401) {
            onSessionClosed(errorResult);
        } else {
            super.onFailureForUiThread(errorResult);
        }
    }
}
