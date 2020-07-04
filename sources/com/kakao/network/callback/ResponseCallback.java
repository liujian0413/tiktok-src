package com.kakao.network.callback;

import com.kakao.network.ErrorResult;

public abstract class ResponseCallback<T> {
    public void onDidEnd() {
    }

    public void onDidStart() {
    }

    public abstract void onFailure(ErrorResult errorResult);

    public void onHandledFailure(ErrorResult errorResult) {
    }

    public abstract void onSuccess(T t);

    public void onFailureForUiThread(ErrorResult errorResult) {
        onFailure(errorResult);
    }

    public void onSuccessForUiThread(T t) {
        onSuccess(t);
    }
}
