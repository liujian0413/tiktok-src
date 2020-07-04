package com.ttnet.org.chromium.net;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public abstract class TTWebsocketConnection {

    public static abstract class Builder {
        public abstract TTWebsocketConnection build();

        public abstract Builder setAppId(int i);

        public abstract Builder setAppKey(String str);

        public abstract Builder setAppToken(String str);

        public abstract Builder setAppVersion(int i);

        public abstract Builder setCustomizedHeaders(Map<String, String> map);

        public abstract Builder setCustomizedParams(Map<String, String> map);

        public abstract Builder setDeviceId(long j);

        public abstract Builder setFpid(int i);

        public abstract Builder setInstallId(long j);

        public abstract Builder setSessionId(String str);

        public abstract Builder setSharedConnection(boolean z);

        public abstract Builder setUrlList(List<String> list);

        public abstract Builder useFrontierProtocol(boolean z);
    }

    public static abstract class Callback {
        public abstract void onConnectionError(TTWebsocketConnection tTWebsocketConnection, int i, String str, String str2);

        public abstract void onConnectionStateChanged(TTWebsocketConnection tTWebsocketConnection, int i, String str);

        public void onFeedbackLog(TTWebsocketConnection tTWebsocketConnection, String str) {
        }

        public abstract void onMessageReceived(TTWebsocketConnection tTWebsocketConnection, ByteBuffer byteBuffer) throws Exception;
    }

    public static class Status {
        private Status() {
        }
    }

    public abstract void asyncSendBinary(ByteBuffer byteBuffer);

    public abstract void destroyConnection();

    public abstract boolean isConnected();

    public abstract void startConnection();

    public abstract void stopConnection();
}
