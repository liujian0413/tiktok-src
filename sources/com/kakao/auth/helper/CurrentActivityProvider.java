package com.kakao.auth.helper;

import android.app.Activity;
import android.app.Application;
import com.kakao.auth.KakaoSDK;

public interface CurrentActivityProvider {

    public static class Factory {
        private static CurrentActivityProvider instance = new DefaultCurrentActivityProvider((Application) KakaoSDK.getAdapter().getApplicationConfig().getApplicationContext());

        public static CurrentActivityProvider getInstance() {
            return instance;
        }
    }

    Activity getCurrentActivity();
}
