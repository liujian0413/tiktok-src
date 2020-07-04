package com.kakao.auth;

import com.kakao.network.ErrorResult;

public abstract class AuthCodeCallback {
    public abstract void onAuthCodeFailure(ErrorResult errorResult);

    public abstract void onAuthCodeReceived(String str);
}
