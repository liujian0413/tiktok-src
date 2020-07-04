package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.kakao.auth.AuthCodeCallback;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.helper.StartActivityWrapper;
import com.kakao.util.IConfiguration;
import java.util.List;

public interface AuthCodeManager {

    public static class Factory {
        private static AuthCodeManager authCodeManager;

        public static AuthCodeManager getInstance() {
            return authCodeManager;
        }

        public static AuthCodeManager initialize(Application application, IConfiguration iConfiguration, ISessionConfig iSessionConfig) {
            if (authCodeManager == null) {
                KakaoAuthCodeManager kakaoAuthCodeManager = new KakaoAuthCodeManager(iConfiguration, iSessionConfig, com.kakao.auth.authorization.authcode.AuthCodeService.Factory.createTalkService(application, iConfiguration, iSessionConfig, com.kakao.util.KakaoUtilService.Factory.getInstance()), com.kakao.auth.authorization.authcode.AuthCodeService.Factory.createStoryService(application, iConfiguration, iSessionConfig, com.kakao.util.KakaoUtilService.Factory.getInstance()), com.kakao.auth.authorization.authcode.AuthCodeService.Factory.createWebService(application, new Handler(Looper.getMainLooper()), iSessionConfig));
                authCodeManager = kakaoAuthCodeManager;
            }
            return authCodeManager;
        }
    }

    boolean handleActivityResult(int i, int i2, Intent intent);

    boolean isStoryLoginAvailable();

    boolean isTalkLoginAvailable();

    void requestAuthCode(AuthType authType, Activity activity, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, Fragment fragment, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, android.support.p022v4.app.Fragment fragment, AuthCodeCallback authCodeCallback);

    void requestAuthCode(AuthType authType, StartActivityWrapper startActivityWrapper, AuthCodeCallback authCodeCallback);

    void requestAuthCodeWithScopes(AuthType authType, StartActivityWrapper startActivityWrapper, List<String> list, AuthCodeCallback authCodeCallback);
}
