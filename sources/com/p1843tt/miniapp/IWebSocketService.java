package com.p1843tt.miniapp;

/* renamed from: com.tt.miniapp.IWebSocketService */
public interface IWebSocketService {

    /* renamed from: com.tt.miniapp.IWebSocketService$IWebSocketServiceListener */
    public interface IWebSocketServiceListener {
        boolean onReceiveMsg(int i, int i2, String str);

        void onWebSocketClosed();

        void onWebSocketConnected();
    }

    String getCurUserId();

    boolean isBackground();

    boolean isConnected();

    boolean isLogin();

    boolean isSettingsEnable();

    void sendMessage(String str);

    void setWebSocketServiceListener(IWebSocketServiceListener iWebSocketServiceListener);
}
