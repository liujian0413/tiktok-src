package com.p280ss.android.websocket.p344ws.output;

/* renamed from: com.ss.android.websocket.ws.output.WSHandShakeState */
public enum WSHandShakeState {
    OK(0),
    INVALID_DEVICEDID(410),
    INVALID_APPID(411),
    UNSUPPORTED_SUBPROTOCOL(412),
    ALREADY_CONNECTED(413),
    TOO_MANY_CONNECTION(414),
    DEVICE_BLOCKED(415),
    ACCESS_DENIED(416),
    AUTHENTICATION_FAILED(417),
    INTERNAL_ERROR(510),
    SERVER_BUZY(511),
    SERVER_SHUTTING_DOWN(512);
    
    public final int value;

    private WSHandShakeState(int i) {
        this.value = i;
    }
}
