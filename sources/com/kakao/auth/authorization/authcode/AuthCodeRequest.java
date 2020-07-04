package com.kakao.auth.authorization.authcode;

import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.network.request.AuthRequest;

class AuthCodeRequest extends AuthRequest {
    private final AuthCodeCallback callback;
    private Integer requestCode;

    public enum Command {
        LOGGED_IN_TALK,
        LOGGED_IN_STORY,
        WEBVIEW_AUTH
    }

    public AuthCodeCallback getCallback() {
        return this.callback;
    }

    public Integer getRequestCode() {
        return this.requestCode;
    }

    public AuthCodeRequest(String str, String str2, Integer num, AuthCodeCallback authCodeCallback) {
        super(str, str2);
        this.callback = authCodeCallback;
        this.requestCode = num;
    }
}
