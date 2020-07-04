package com.kakao.auth;

import com.kakao.util.exception.KakaoException;

public interface ISessionCallback {
    void onSessionOpenFailed(KakaoException kakaoException);

    void onSessionOpened();
}
