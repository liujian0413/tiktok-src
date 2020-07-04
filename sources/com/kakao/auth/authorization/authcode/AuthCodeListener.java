package com.kakao.auth.authorization.authcode;

import com.kakao.auth.authorization.AuthorizationResult;

public interface AuthCodeListener {
    void onAuthCodeReceived(int i, AuthorizationResult authorizationResult);
}
