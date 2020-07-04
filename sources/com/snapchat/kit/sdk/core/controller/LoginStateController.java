package com.snapchat.kit.sdk.core.controller;

public interface LoginStateController {

    public interface OnLoginStartListener {
        void onLoginStart();
    }

    public interface OnLoginStateChangedListener {
        void onLoginFailed();

        void onLoginSucceeded();

        void onLogout();
    }

    void addOnLoginStartListener(OnLoginStartListener onLoginStartListener);

    void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener);

    void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener);

    void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener);
}
