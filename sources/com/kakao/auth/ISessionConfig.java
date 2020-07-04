package com.kakao.auth;

public interface ISessionConfig {
    ApprovalType getApprovalType();

    AuthType[] getAuthTypes();

    boolean isSaveFormData();

    boolean isSecureMode();

    boolean isUsingWebviewTimer();
}
