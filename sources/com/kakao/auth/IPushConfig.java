package com.kakao.auth;

public interface IPushConfig {
    String getDeviceUUID();

    ApiResponseCallback<Integer> getTokenRegisterCallback();
}
